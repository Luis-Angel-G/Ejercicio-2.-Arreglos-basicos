import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Interfaz{
	public static void main(String[] args){
		boolean menu = true;
		int opcion = 0;
		int cantp = 0;
		int cantd =0;
		Main main = new Main();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de proyectos que tendra la empresa: ");
		cantp = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese la cantidad de desarrolladores que tiene la empresa: ");
		cantd = teclado.nextInt();
		teclado.nextLine();
		main.Main(cantp, cantd);
		
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
			}
            
			
			
		}
	}
}