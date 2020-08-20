
public class EjemploArbol1 {

    public static void main(String[] args) {
       
        Nodo raiz = new Nodo(null); // creo el objeto de la clase
        raiz.setTitulo("LIBRO"); // titulo a nodo raiz
        // EMPIEZO A AÑADIR HIJOS
        // CAPITULO 1
        Nodo capitulo1 = agregarHijo(raiz, "CAPITULO 1");
            agregarHijo(capitulo1, "1.1"); // agrego un nodo hijo (hoja)
            Nodo cap1Sec2 = agregarHijo(capitulo1, "1.2"); // agrego un nodo padre para que pueda tener hijos
                agregarHijo(cap1Sec2, "1.2.1"); // agrego un nodo hijo (hoja)
                agregarHijo(cap1Sec2, "1.2.2"); // agrego un nodo hijo (hoja)
        
        // CAPITULO 2
        agregarHijo(raiz, "CAPITULO 2"); // agrego un nodo hijo (hoja)
        
        // CAPITULO 3
        Nodo capitulo3 = agregarHijo(raiz, "CAPITULO 3");
            agregarHijo(capitulo3, "3.1"); // agrego un nodo hijo (hoja)
            Nodo cap1Sec3 = agregarHijo(capitulo3, "3.2"); // agrego un nodo padre para que pueda tener hijos
                agregarHijo(cap1Sec3, "3.2.1"); // agrego un nodo hijo (hoja)
                agregarHijo(cap1Sec3, "3.2.2"); // agrego un nodo hijo (hoja)
            agregarHijo(capitulo3, "3.3"); // agrego un nodo hijo (hoja)
        
        // CAPITULO 4    
        agregarHijo(raiz, "CAPITULO 4"); // agrego un nodo hijo (hoja)
        
        // MOSTRAR ARBOL
        mostrarArbol(raiz, " ");

    }

    // metodo para agregar hijos
    // se le pasa por parametro el nodo padre al que pertenecera y le dare un nombre
    private static Nodo agregarHijo(Nodo padre, String titulo) {
        Nodo objeto = new Nodo(padre); // creo el objeto
        objeto.setTitulo(titulo); // le asigno nombre
        padre.getHijos().add(objeto); // lo agrego
        return objeto; // y lo retorno
    }
    
    //METODO DE IMPRESION CON FORMATO
    private static void mostrarArbol(Nodo objeto, String agrupar) {
        System.out.println(agrupar + objeto.getTitulo());
        for (Nodo each : objeto.getHijos()) {
            mostrarArbol(each, agrupar + agrupar);
        }
    }
}
