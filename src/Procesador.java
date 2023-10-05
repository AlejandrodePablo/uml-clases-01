public class Procesador {
//Clase añadida a git
    //Estados, atributos y propiedades

    public String marca;
    public String modelo;
    public Double precio;

    //Comportamiento o método (funciones)

    public String getNombreCompleto() {
        //Concatenar cadenas con + y " " vacios para espacios en blanco
        // AMD 7600 32.2 seria un ejemplo de como queda
        return marca + " " + modelo + " " + precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public Double getPrecio(){
        return precio;
    }
}