import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//Definimos el elemento raiz del XML
@XmlRootElement(name = "recetas")

//Definimos la clase ListaIngredientes
public class ListaIngredientes {

    //Declaramos los atributos de la clase
    private ArrayList<Ingrediente> listaIngredientes;

    //Creamos el constructor con los atributos
    public ListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        super();
        this.listaIngredientes = listaIngredientes;
    }

    //Creamos el constructor vacio

    public ListaIngredientes() {
    }

    //Creamos los getter y los setter de los atributos
    //Definimos el atributo cuando es un array
    @XmlElement(name = "ingrediente")
    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
