package ejercicio_1;

public class Empleado_repartidor extends Empleado{
    private String Zona;

    public Empleado_repartidor(String nombre, int edad, int salario, String zona){
        super(nombre, edad, salario);
        this.Zona=zona;
    }
    public String getZona() {
        return Zona;
    }
    public void setZona(String zona) {
        Zona = zona;
    }
    @Override
    public String toString(){      // se hace uso de la herencia
        return super.toString()+"\nZona: "+getZona();
    }
    @Override
    public void plus() {
        if(getEdad() <=25 && getZona().equals("zona 3")){
            // PLUS es la comision de 300
            System.out.println("----- Empleado apto para el Plus");
            int extra= getSalario()+PLUS;
            setSalario(extra);
        } else{
            System.out.println("----- No es apto para el Plus");
        }
        
    }
}
