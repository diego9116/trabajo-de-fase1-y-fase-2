package ejercicio_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Vehiculo {
    private String matricula;
    private String marca;
    private double tamanio;
    private String modelo;

    public Vehiculo(String matricula, String marca, double tamanio, String modelo){
        this.matricula= matricula;
        this.marca = marca;
        this.tamanio= tamanio;
        this.modelo = modelo;
    }

    public Vehiculo(){};

    public void escritura( ) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String cadena_escribir = getMatricula();//+"|"+getMarca()+"|"+getTamanio()+"|"+getModelo();
        archivo = new File("src/ejercicio_3/datos.txt");
        try {
            archivo.createNewFile();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

            linea.println(cadena_escribir);

            cadena_escribir = getMarca();
            linea.println(cadena_escribir);

            cadena_escribir = String.valueOf(getTamanio());
            linea.println(cadena_escribir);

            cadena_escribir = getModelo();
            linea.println(cadena_escribir);
            linea.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void dialogo(String matricula,String marc,String tamanio, String modelo){
        String cadena= "El Vehiculo tiene un matricula  "+matricula+", su marca es  "+marc+", el tamanio del deposito es de  "+tamanio+" Litros y su modelo es  "+modelo;
        JOptionPane.showMessageDialog(null, cadena);
    }

    public void lectura_y_muestra_dialogo(){
        String matri,marc,tama,mode;
        //String lectura_linea[]={};
        ArrayList<String> array_lectura= new ArrayList<String>();
        int cont=0; int conta_x=0;
        Scanner sc=new Scanner(System.in);
        FileWriter f;
    
        FileReader fr = null;
        try {
            fr = new FileReader("src/ejercicio_3/datos.txt");
            BufferedReader entrada = new BufferedReader (fr);
            String cadena =" ";//= entrada.readLine();

            while (cadena != null) {
                //array_lectura.add(cadena);
                cont++;
                cadena = entrada.readLine();
                //System.out.println(cadena);
                
                // falta implentar la lectrua para ek mensaje
                //if(cont%4==0){
                array_lectura.add(cadena);
                if(array_lectura.size() % 4==0){
                    //dialogo(matri, marc, tama, mode);
                    //System.out.println(array_lectura);
                    dialogo(array_lectura.get(0),array_lectura.get(1), array_lectura.get(2), array_lectura.get(3));

                    array_lectura.clear();
                }
                    
                    
                //}
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        //se lee la primera línea del fichero
        //mientras no se llegue al final del fichero
        //se nuestra por pantalla
        //se lee la siguiente línea del fichero
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamanio() {
        return tamanio;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   

    @Override
    public String toString() {
        return "Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nTamanio: "+getTamanio()+"Modelo: "+getModelo(); 
    }

}
