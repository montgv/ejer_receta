import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

//Definimos el orden en el que se van a escribir los elementos
@XmlType (propOrder = {"tipo", "dificultad", "nombre", "ingredientes", "calorias", "pasos", "tiempo", "elaboracion"})

//Definimos la clase Receta
public class Receta {

    //Declaramos los atributos de la clase
    private String tipo;
    private String dificultad;
    private String nombre;
    private String[] ingredientes;
    private int calorias;
    private String[] pasos;
    private String tiempo;
    private String elaboracion;

    //Creamos el constructor con los atributos
    public Receta(String tipo, String dificultad, String nombre, String[] ingredientes, int calorias, String[] pasos,
                  String tiempo, String elaboracion) {
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
        this.pasos = pasos;
        this.tiempo = tiempo;
        this.elaboracion = elaboracion;
    }

    public Receta() {
    }

    //Creamos los getter y los setter de todos los atributos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Definimos el atributo cuando es un array
    @XmlElementWrapper(name = "ingredientes")
    @XmlElement(name = "ingrediente")
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    //Definimos el atributo cuando es un array
    @XmlElementWrapper(name = "pasos")
    @XmlElement(name = "paso")
    public String[] getPasos() {
        return pasos;
    }

    public void setPasos(String[] pasos) {
        this.pasos = pasos;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }
}
