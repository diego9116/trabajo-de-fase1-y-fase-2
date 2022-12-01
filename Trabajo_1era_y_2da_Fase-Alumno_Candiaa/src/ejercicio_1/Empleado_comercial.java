package ejercicio_1;

public class Empleado_comercial extends Empleado {
    private double comision;

    public Empleado_comercial(String nombre, int edad, int salario){
        super(nombre, edad, salario);
        this.comision=0;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
    @Override
    public String toString() {
        return super.toString()+"\nComision: "+getComision();
    }
    @Override
    public void plus() {
        if(getEdad() >30){
            setComision(PLUS); // PLUS es la comision de 300
        } else{
            System.out.println("-------- NO APTO para el PLUS");
        }
    }
    
}
