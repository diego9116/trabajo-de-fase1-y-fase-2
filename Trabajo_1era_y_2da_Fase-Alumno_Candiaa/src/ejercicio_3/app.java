package ejercicio_3;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        //Vehiculo m = new Vehiculo("CGI-001","Toyota",5.30,"Fortuner");
        //m.escritura();
        Scanner sc = new Scanner(System.in);
        boolean validar= true;
        int opcion;
        do{
            System.out.println("\tMenu");
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Mostrar Vehiculos");
            System.out.println("3. Salir");
            System.out.print("Ingrese la Opcion: "); ;opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-- Datos del Vehiculo");
                    System.out.print("Matricula: "); String matricula= sc.next();
                    System.out.print("Marca: "); String marca= sc.next();
                    System.out.print("Tamanio del tanque: "); int tamanio= sc.nextInt();
                    System.out.print("Modelo: "); String modelo= sc.next();

                    Vehiculo agregar_Vehiculo = new Vehiculo(matricula, marca, tamanio, modelo) ;
                    agregar_Vehiculo.escritura();
                    break;
                
                case 2:
                    Vehiculo vehiculo_lectura = new Vehiculo();        
                    vehiculo_lectura.lectura_y_muestra_dialogo();
                    break;
                
                case 3:
                    validar= false;
                    break;   
            }
        }while(validar);
        


    }
}
