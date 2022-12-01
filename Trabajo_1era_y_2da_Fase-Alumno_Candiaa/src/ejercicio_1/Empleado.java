package ejercicio_1;

public abstract class Empleado {
    static int PLUS = 300;        // constante 
    private String nombre;
    private int edad;
    private int salario;
    
    // constructor
    public Empleado(String nombre, int edad, int salario){
        this.nombre= nombre;
        this.edad= edad;
        this.salario= salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    // metodo abstracto se implenetara en cada clase de forma diferente
    public abstract void plus();
    
    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nSalario: "+getSalario();
    }
    
}
