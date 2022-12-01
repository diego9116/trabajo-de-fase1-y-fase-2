package ejercicio_2;
import java.util.Scanner;

public class Maquina_expendedora {
    String[][] nombresGolosinas = {
        {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
        {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
        {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
        {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };

    double[][] precio = {
        {1.1, 0.8, 1.5, 0.9},
        {1.8, 1, 1.2, 1},
        {1.8, 1.3, 1.2, 0.8},
        {1.5, 1.1, 1.1, 1.1}
    };

    int[][] cantidad = {
        {5,5,5,5},
        {5,5,5,5},
        {5,5,5,5},
        {5,5,5,5}
    };

    public void menu(){
        Scanner sc= new Scanner(System.in);
        boolean validar=true;
        do{
            int opcion;
            System.out.println("------------- 1. Pedir Golosina    ---------------");
            System.out.println("------------- 2. Mostrar Golosina  ---------------");
            System.out.println("------------- 3. Rellenar Golosina ---------------");
            System.out.println("------------- 4. Apagar Maquina    ---------------");
            System.out.print("Ingrese la opcion: "); opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    pedir_golosina();
                    break;
                case 2:
                    mostrar_golosinas();
                    break;
                case 3:
                    rellenar_golosinas();
                    break;
                case 4:
                    apagar_maquina();
                    validar= false;
                    break;
            }
        }while(validar);
    }

    public void pedir_golosina(){
        Scanner sc= new Scanner(System.in);

        int fila,columna,cantidad_de_pedido;
        do{
            System.out.println("-- Posicion de la Golosina --");
            System.out.print("Fila: ");
            fila=sc.nextInt(); 
            System.out.print("Columna: ");
            columna=sc.nextInt(); 
            System.out.print("Cantidad: ");
            cantidad_de_pedido=sc.nextInt(); 
        }while(!(fila >-1 && fila<4 && columna >-1 && columna<4 &&  cantidad_de_pedido>0 && cantidad_de_pedido<6 ));

        // resta de cantidad
        if( precio[fila][columna] !=0 ){
            System.out.println("Golosina: "+nombresGolosinas[fila][columna]);
            System.out.println("Precio: "+precio[fila][columna]);
            precio[fila][columna]=precio[fila][columna] -1;
        } else{
            System.out.println(" Sin Stock ");
        }
            
    }

    public void mostrar_golosinas(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4;j++){
                System.out.println("Codigo: "+i+j+"\tGolosina: "
                +nombresGolosinas[i][j]+"\tPrecio: "+precio[i][j]);
            }
            System.out.println("\n");
        }
    }
    public void rellenar_golosinas(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese Ususaio\nName: ");String name= sc.next();
        
        usuario user= new usuario(name);
        if (user.getNombre()== "MaquinaExpendedora2017" ){
            pedir_golosina();
        } else{
            System.out.println("Usuario no valido");
        }
    }

    public void apagar_maquina(){
        mostrar_golosinas();
    }

}
