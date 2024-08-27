import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Interfaz{
	public static void main(String[] args){
		boolean menu = true;
		int opcion = 0;
		int cantp = 0;
		int cantd = 0;
		String nombrep = "";
		String fecha = "";
		Date fechal;
		int cantt = 0;
		Main main = new Main();
		
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
					System.out.println("Ingrese el numero de la categoria del proyecto:")
					categoria = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Ingrese la fecha limite para la entrega del proyecto en formato dd/MM/yyyy:")
					fecha = teclado.nextLine();
					try {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        fechal = formato.parse(fecha);
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto.");
                        break;
                    }
					System.out.println("Ingrese la cantidad de tareas que tendra el proyecto:")
					cantt = teclado.nextInt();
					teclado.nextLine();
					System.out.println("--- Desarrolladores senior ---")
					
					Proyecto nuevoProyecto = new Proyecto(nombrep, categoria, fechal, cantt);
                    main.agregarProyecto(nuevoProyecto);

                    System.out.println("Proyecto creado exitosamente.");
                    break;

                case 2:
					System.out.print

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