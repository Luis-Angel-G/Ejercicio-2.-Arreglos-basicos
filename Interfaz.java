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
		String nombred = "";
		int puesto = 0;
		String contrasenia = "";
		String contra = "";
		int nuevoEstado = 0;
		double horas = 0;
		int el = 0;
		String ncontr = "";
		
		Scanner teclado = new Scanner(System.in);
		Main main = null;
		
		try {
			System.out.println("Ingrese la cantidad de proyectos que tendra la empresa: ");
			cantp = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Ingrese la cantidad de desarrolladores que tiene la empresa: ");
			cantd = teclado.nextInt();
			teclado.nextLine();
			Main main = new Main(cantp, cantd);
		} catch (IngresarExcepcion e) {
			System.out.println("Error: No es el tipo de dato correcto.");
		}
		
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
					cantt = 0;
					try {
						System.out.println("Ingrese la cantidad de tareas que tendra el proyecto:");
						cantt = teclado.nextInt();
						teclado.nextLine();
					} catch (IngresarException e) {
						System.out.println("Error: No es el tipo de dato correcto.");
					}
					System.out.println("--- Desarrolladores senior ---");
					Desarrollador[] seniorDev = main.desarrolladoresS();
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
					Desarrollador[] juniorDev = main.desarrolladoresJ();
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
					System.out.println("--- Proyectos ---");
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
                    
                    System.out.println("Ingrese el nombre de la tarea:");
                    nombret = teclado.nextLine();
                    System.out.println("--- Tipos ---");
                    System.out.println("1. Desarrollo");
                    System.out.println("2. Pruebas");
                    System.out.println("3. Documentación");
                    System.out.print("Ingrese el número del tipo de la tarea: ");
                    tipo = teclado.nextInt();
                    teclado.nextLine();
                    if (tipo == 1 || tipo == 2 || tipo == 3) {
						
					} else {
						System.out.println("ERROR: Ingrese solo los numeros que aparecen en pantalla");
						break;
					}
					
                    try {
						System.out.print("Ingrese el tiempo estimado de la tarea: ");
						test = teclado.nextDouble();
						teclado.nextLine();
					} catch (IngresarException e) {
						System.out.println("Error: No es el tipo de dato correcto.");
					}
                    
                    System.out.println("--- Desarrolladores ---");
                    Desarrollador[] desarrolladoresProyecto = proyectoSeleccionado.getDesarrolladores();
                    for (int i = 0; i < desarrolladoresProyecto.length; i++) {
                        if (desarrolladoresProyecto[i] != null) {
                            System.out.println(i + ": " + desarrolladoresProyecto[i]);
                        }
                    }
                    System.out.print("Ingrese el índice del desarrollador encargado de la tarea: ");
                    int idxDesarrollador = teclado.nextInt();
                    teclado.nextLine();
                    Desarrollador desarrolladorEncargado = desarrolladoresProyecto[idxDesarrollador];
                    
                    Tarea nuevaTarea = new Tarea(nombret, tipo, test, desarrolladorEncargado);
                    nuevaTarea.setNombre(nombret);
                    nuevaTarea.setTipo(tipo);
                    nuevaTarea.setTEstimado(test);
                    nuevaTarea.setDesarrollador(desarrolladorEncargado);
                    proyectoSeleccionado.agregarTarea(nuevaTarea);

                    System.out.println("Tarea agregada exitosamente.");
                    break;
				case 3:
					System.out.println("Ingrese el nombre del desarrollador:");
					nombred = teclado.nextLine();
					System.out.println("--- Puestos ---");
					System.out.println("1. Senior");
					System.out.println("2. Junior");
					System.out.println("Ingrese el numero del puesto del desarrollador:");
					puesto = teclado.nextInt();
					teclado.nextLine();
					if (puesto == 1 || puesto == 2) {
						
					} else {
						System.out.println("ERROR: Ingrese solo los numeros que aparecen en pantalla");
						break;
					}
					System.out.println("Ingrese la contraseña del desarrollador:");
					contrasenia = teclado.nextLine();

					
					Desarrollador nuevoDesarrollador = new Desarrollador(nombred, puesto, contrasenia);
                    main.agregarDesarrollador(nuevoDesarrollador);

                    System.out.println("Desarrollador creado exitosamente.");
                    break;
				case 4:
					System.out.println("--- Proyectos ---");
                    proyectos = main.getProyectos();
                    for (int i = 0; i < proyectos.length; i++) {
                        if (proyectos[i] != null) {
                            System.out.println(i + ": " + proyectos[i]);
                        }
                    }
                    System.out.print("Seleccione el índice del proyecto al que desea actualizar la tarea: ");
                    idxProyecto = teclado.nextInt();
                    teclado.nextLine();
                    proyectoSeleccionado = proyectos[idxProyecto];

                    System.out.println("--- Tareas ---");
                    Tarea[] tareas = proyectoSeleccionado.getTareas();
                    for (int i = 0; i < tareas.length; i++) {
                        if (tareas[i] != null) {
                            System.out.println(i + ": " + tareas[i]);
                        }
                    }
                    System.out.print("Seleccione el índice de la tarea a actualizar: ");
                    int idxTarea = teclado.nextInt();
                    teclado.nextLine();
                    Tarea tareaSeleccionada = tareas[idxTarea];

                    System.out.println("Ingrese su contraseña de desarrollador:");
					contra = teclado.nextLine();
					if (tareaSeleccionada.getDesarrollador().getContrasenia().equals(contra)) {
						System.out.println("--- Actualización de Estado de la Tarea ---");
						System.out.println("1. Pendiente");
						System.out.println("2. En Proceso");
						System.out.println("3. Finalizada");
						System.out.print("Ingrese el nuevo estado de la tarea: ");
						int nuevoEstado2 = teclado.nextInt();
						teclado.nextLine();
						if (nuevoEstado2 == 1 || nuevoEstado2 == 2 || nuevoEstado2 == 3) {
						
						} else {
						System.out.println("ERROR: Ingrese solo los numeros que aparecen en pantalla");
						break;
						}

						tareaSeleccionada.setEstado(nuevoEstado);
						System.out.println("Estado de la tarea actualizado exitosamente.");
						
						try {
							System.out.println("Ingrese cuantas horas trabajo esta vez:");
							horas = teclado.nextDouble();
							teclado.nextLine();
							tareaSeleccionada.setTReal(tareaSeleccionada.getTReal() + horas);
						} catch (IngresarException e) {
							System.out.println("Error: No es el tipo de dato correcto.");
						}
						
						System.out.println("Quiere actualizar contraseña?");
						System.out.println("1. Si");
						System.out.println("2. No");
						el = teclado.nextInt();
						teclado.nextLine();
						if (el == 1){
							System.out.println("Ingrese nueva contraseña:");
							ncontr = teclado.nextLine();
							tareaSeleccionada.getDesarrollador().setContrasenia(ncontr);
							System.out.println("Contraseña actualizada correctamente.");
						} else {
							break;
						}
						break;
					} else {
						System.out.println("Contraseña incorrecta");
						break;
					}
				case 5:
					System.out.println("--- REPORTE DE PROYECTOS EXISTENTES ---");
					Proyecto[] proyectos2 = main.getProyectos();
					for (Proyecto p : proyectos2) {
						if (p != null) {
							System.out.println("\nPROYECTO: " + p.getNombre());
							System.out.println("CODIGO: " + p.getCategoria());
							System.out.println("TAREAS ASIGNADAS:");
							
							Tarea[] tareas2 = p.getTareas();
							for (Tarea t : tareas2) {
								if (t != null) {
									System.out.println(t);
								}
							}
						}
					}
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