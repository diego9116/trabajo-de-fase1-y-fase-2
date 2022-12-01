package ejercicio_2;

public class usuario {
    private String nombre;

    public usuario(String nombre){
        this.nombre=nombre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Nombre: "+getNombre();
    }
}
