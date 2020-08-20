// LIBRERIAS: LIST Y ARRAYLIST PARA LA CREACION DE HIJOS
import java.util.ArrayList;
import java.util.List;

// CLASE PRINCIPAL
public class Nodo {
    
    private String titulo; // me guardara los titulos de cada objeto (para el nodo padre y los nodos hijos)
    private final List<Nodo> hijos = new ArrayList<>(); // me guardara a los hijos (hojas)
    private final Nodo padre; // para el nodo padre

    // EL CONSTRUCTOR DE LA CLASE, DE PARAMETRO SE LE PASARA EL PADRE
    public Nodo(Nodo padre) {
        this.padre = padre;
    }

    // OBTENER EL TITULO DEL NODO
    public String getTitulo() {
        return titulo;
    }

    // ASIGNAR TITULO A NODO
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // OBTENER LA LISTA DE HIJOS
    public List<Nodo> getHijos() {
        return hijos;
    }

    // OBTENER AL PADRE
    public Nodo getPadre() {
        return padre;
    }
    
}
