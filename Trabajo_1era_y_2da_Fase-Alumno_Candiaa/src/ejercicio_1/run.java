package ejercicio_1;

public class run {
    public static void main(String[] args) {
        // El programa no nos dejara crear el Empleado
          //  Empleado n= new Empleado("Moises",2,200);
        
        // ------------ Empleado Repartidor ------------ 
        String Zonas[]= {"zona 1","zona 2","zona 3","zona 4"}; 
        Empleado_repartidor emp_rep_1 = new Empleado_repartidor("Moises", 21, 700, Zonas[2]);
        System.out.println("\tEmpleado Repartidor 1 Antes del plus \n"+emp_rep_1);
        emp_rep_1.plus(); // apto
        System.out.println("\tEmpleado Repartidor 1 Despues del plus \n"+emp_rep_1);
        
        Empleado_repartidor emp_rep_2 = new Empleado_repartidor("isaias", 26, 800, Zonas[1]);
        System.out.println("\n\tEmpleado Repartidor 2 Antes del plus \n"+emp_rep_2);
        emp_rep_2.plus(); // no apto
        System.out.println("\tEmpleado Repartidor 2 Despues del plus \n"+emp_rep_2+"\n\n");

        

        // ------------ Empleado compercial ------------ 

        Empleado_comercial emp_com_1 = new Empleado_comercial("Sebastian", 20, 1000);
        System.out.println("\tEmpleado Comercial 1 Antes del plus \n"+emp_com_1);
        emp_com_1.plus(); // no apto
        System.out.println("\tEmpleado Comercial 1 Despues del plus \n"+emp_com_1);
        
        Empleado_comercial emp_com_2 = new Empleado_comercial("Alejandro", 31, 900);
        System.out.println("\n\tEmpleado Comercial 2 Antes del plus \n"+emp_com_2);
        emp_com_2.plus(); // apto
        System.out.println("\tEmpleado Comercial 2 Despues del plus \n"+emp_com_2);

    }
}
