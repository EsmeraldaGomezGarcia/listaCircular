
package listasenlazadas;


public class Nodo {
    
    int dato;
    Nodo nodoDere;

    public Nodo(int dato, Nodo nodoDere) {
        this.dato = dato;
        this.nodoDere = nodoDere;
    }

    public Nodo(int dato) {
        this.dato=dato;
    }
}

