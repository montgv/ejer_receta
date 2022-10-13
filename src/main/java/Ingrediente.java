import javax.xml.bind.annotation.XmlType;

//Definimos el orden en el que se van a escribir los elementos
@XmlType(propOrder = {"nombre", "cantidad"})

public class Ingrediente {

    //Declaramos los atributos de la clase
    private String nombre;
    private String cantidad;

    //Creamos el constructor con los atributos
    public Ingrediente(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Creamos el constructor vacio
    public Ingrediente() {
    }

    //Creamos los getter y setter de todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
