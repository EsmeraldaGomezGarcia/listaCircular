package ListaD;

public class Nodo {

    int dato;
    Nodo nodoDere;
    Nodo nodoIzq;

    public Nodo(int dato, Nodo nodoDere, Nodo nodoIzq) {
        this.dato = dato;
        this.nodoDere = nodoDere;
        this.nodoIzq = nodoIzq;
    }

    public Nodo(int dato) {
        this.dato = dato;
    }
}
