import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Xml_To_Jaxb_Receta {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        //Creamos el contexto indicando la clase raiz
        JAXBContext context1 = JAXBContext.newInstance(ListaRecetas.class);

        //Creamos el unmarshaller en el contexto de la clase raiz
        Unmarshaller unmarshaller1 = context1.createUnmarshaller();

        //Obtenemos los datos de un Reades con el metodo unmarshaller
        ListaRecetas listaRecetas2 = (ListaRecetas) unmarshaller1.unmarshal(new FileReader("recetas.xml"));

        //Extraemos los datos y los mostramos por pantalla
        System.out.println("Lista de las recetas: ");

        ArrayList<Receta> lista = listaRecetas2.getListaRecetas();


        for (Receta receta : lista) {
            System.out.println("\tTipo de receta: " + receta.getTipo());
            System.out.println("\tDificultad de la receta: " + receta.getDificultad());
            System.out.println("\tNombre de la receta: " + receta.getNombre());
            System.out.println("\tIngredientes de la receta: ");
            ArrayList<Ingrediente> listaIngredientes = receta.getListaIngredientes();

            for (Ingrediente ingrediente : listaIngredientes) {
                System.out.println("\t\tIngrediente: ");
                System.out.println("\t\t\tNombre del ingrediente: " + ingrediente.getNombre());
                System.out.println("\t\t\tCantidad del ingrediente: " + ingrediente.getCantidad());
            }

            System.out.println("\tCalorias de la receta: " + receta.getCalorias());
            System.out.println("\tPasos de la receta: ");
            for (int i = 0; i < receta.getPasos().length; i++) {
                System.out.println("\t\tPaso " + (i + 1) + ": " + receta.getPasos()[i]);
            }
            System.out.println("\tTiempo de la receta: " + receta.getTiempo());
            System.out.println("\tElaboración de la receta: " + receta.getElaboracion());
        }
    }
}
