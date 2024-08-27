import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Interfaz{
	public static void main(String[] args){
		boolean menu = true;
		int opcion = 0;
		int cantp = 0;
		int cantd = 0;
		String nombrep = "";
		String fecha = "";
		Date fechal;
		int categoria = 0;
		int cantt = 0;
		String nombret = "";
		int tipo = 0;
		double test = 0;
		Desarrollador des;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de proyectos que tendra la empresa: ");
		cantp = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese la cantidad de desarrolladores que tiene la empresa: ");
		cantd = teclado.nextInt();
		teclado.nextLine();
		Main main = new Main(cantp, cantd);
		
        while(menu){
            System.out.println("--- Menu Principal ---");
            System.out.println("1. Crear nuevo proyecto");
            System.out.println("2. Agregar tarea a proyecto");
            System.out.println("3. Crear nuevo desarrollador");
            System.out.println("4. Actualizar estado de tarea");
			System.out.println("5. Generar reporte de proyecto");
			System.out.println("6. Salir");
            System.out.println("Seleccione una opcion: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcion) {
				case 1:
					System.out.println("Ingrese el nombre del proyecto:");
					nombrep = teclado.nextLine();
					System.out.println("--- Categorias ---");
					System.out.println("1. Desarrollo de Software");
					System.out.println("2. Mantenimiento de Sistemas");
					System.out.println("Ingrese el numero de la categoria del proyecto:");
					categoria = teclado.nextInt();
					teclado.nextLine();
					if (categoria == 1 || categoria == 2) {
						
					} else {
						System.out.println("ERROR: Ingrese solo los numeros que aparecen en pantalla");
						break;
					}
					System.out.println("Ingrese la fecha limite para la entrega del proyecto en formato dd/MM/yyyy:");
					fecha = teclado.nextLine();
					try {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        fechal = formato.parse(fecha);
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto.");
                        break;
                    }
					System.out.println("Ingrese la cantidad de tareas que tendra el proyecto:");
					cantt = teclado.nextInt();
					teclado.nextLine();
					System.out.println("--- Desarrolladores senior ---");
					Desarrollador[] seniorDev = main.getDesarrolladoresS();
                    for (int i = 0; i < seniorDev.length; i++) {
                        if (seniorDev[i] != null) {
                            System.out.println(i + ": " + seniorDev[i]);
                        }
                    }
                    System.out.print("Seleccione el índice del desarrollador senior: ");
                    int idxSenior = teclado.nextInt();
                    teclado.nextLine();
                    Desarrollador desarrolladorSenior = seniorDev[idxSenior];
					
					System.out.println("--- Desarrolladores junior ---");
					Desarrollador[] juniorDev = main.getDesarrolladoresJ();
                    for (int i = 0; i < juniorDev.length; i++) {
                        if (juniorDev[i] != null) {
                            System.out.println(i + ": " + juniorDev[i]);
                        }
                    }
                    System.out.print("Seleccione el índice del desarrollador junior: ");
                    int idxJunior = teclado.nextInt();
                    teclado.nextLine();
                    Desarrollador desarrolladorJunior = juniorDev[idxJunior];
					
					Proyecto nuevoProyecto = new Proyecto(nombrep, categoria, fechal, cantt, desarrolladorJunior, desarrolladorSenior);
                    main.agregarProyecto(nuevoProyecto);

                    System.out.println("Proyecto creado exitosamente.");
                    break;

                case 2:
					System.out.println("Ingrese el nombre de la tarea:");
					nombret = teclado.nextLine();
					
					System.out.println("--- Tipos ---");
					System.out.println("1. Desarrollo");
					System.out.println("2. Pruebas");
					System.out.println("3. Documentacion");
					System.out.println("Ingrese el numero del tipo de la tarea:");
					tipo = teclado.nextInt();
					teclado.nextLine();
					if (tipo == 1 || tipo == 2 || tipo == 3) {
						
					} else {
						System.out.println("ERROR: Ingrese solo los numeros que aparecen en pantalla");
						break;
					}
					
					System.out.println("Ingrese el tiempo estimado de la tarea:");
					test = teclado.nextDouble();
					teclado.nextLine();
					
					System.out.println("--- Desarrolladores ---");
					System.out.println(desarrolladorJunior);
					System.out.println(desarrolladorSenior);
					System.out.println("Ingrese el nombre del desarrollador encargado de la tarea:");
					des = teclado.nextLine();
					
					System.out.println("--- Seleccionar proyecto ---");
                    Proyecto[] proyectos = main.getProyectos();
                    for (int i = 0; i < proyectos.length; i++) {
                        if (proyectos[i] != null) {
                            System.out.println(i + ": " + proyectos[i]);
                        }
                    }
                    System.out.print("Seleccione el índice del proyecto al que desea agregar la tarea: ");
                    int idxProyecto = teclado.nextInt();
                    teclado.nextLine();
                    Proyecto proyectoSeleccionado = proyectos[idxProyecto];
                    
                    Tarea nuevaTarea = new Tarea(nombret, tipo, test, desarrolladorEncargado);
                    proyectoSeleccionado.agregarTarea(nuevaTarea);

                    System.out.println("Tarea agregada exitosamente.");
                    break;
                case 6:
                    menu = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
			}
		}
	}
}