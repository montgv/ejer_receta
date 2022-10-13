import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//Definimos el elemento raiz del XML
@XmlRootElement(name = "recetas")

public class ListaRecetas {
    //Declaramos los atributos de la clase
    private ArrayList<Receta> listaRecetas;

    //Creamos el constructor con los atributos
    public ListaRecetas(ArrayList<Receta> listaRecetas) {
        super();
        this.listaRecetas = listaRecetas;
    }

    //Creamos el constructor vacio
    public ListaRecetas() {
    }

    //Creamos los getter y los setter de los atributos
    //Definimos el atributo cuando es un array
    @XmlElement(name = "receta")
    public ArrayList<Receta> getListaRecetas() {
        return listaRecetas;
    }

    public void setListaRecetas(ArrayList<Receta> listaRecetas) {
        this.listaRecetas = listaRecetas;
    }
}
