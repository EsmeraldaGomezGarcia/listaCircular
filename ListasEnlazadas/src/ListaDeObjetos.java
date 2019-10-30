
public class ListaDeObjetos {

    public Nodo primerNodo;
    public Nodo UltimoNodo;
    public int tamaño;

    public ListaDeObjetos(Nodo primerNodo, Nodo UltimoNodo, int tamaño) {
        this.primerNodo = null;
        this.UltimoNodo = null;
        this.tamaño = 0;
    }

    public ListaDeObjetos() {

    }

    public ListaDeObjetos agregarAlFinal(Object dato) {
        if (validar()) {
            Nodo nuevo = new Nodo(dato);
            primerNodo = nuevo;
            UltimoNodo = nuevo;
            nuevo.nodoDere = null;
            nuevo.nodoIzq = null;
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDere = null;
            nuevo.nodoIzq = UltimoNodo;
            UltimoNodo.nodoDere = nuevo;
            UltimoNodo = nuevo;
        }
        this.tamaño++;
        return this;
    }

    public ListaDeObjetos agregarAlInicio(Object dato) {
        if (validar()) {
            Nodo nuevo = new Nodo(dato);
            primerNodo = nuevo;
            UltimoNodo = nuevo;
            nuevo.nodoDere = null;
            nuevo.nodoIzq = null;
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDere = primerNodo;
            nuevo.nodoIzq = null;
            primerNodo.nodoIzq = nuevo;
            primerNodo = nuevo;
        }
        this.tamaño++;
        return this;
    }

    private boolean validar() {
        return (this.primerNodo == null);
    }

    public int getTamaño() {
        return tamaño;
    }

    public void mostrarIzq_Der() {
        if (tamaño != 0) {
            Nodo temporal = primerNodo;
            String cadenaValores = "";
            for (int i = 0; i < this.tamaño; i++) {
                cadenaValores += temporal.dato + "\n";
                temporal = temporal.nodoDere;
            }
            System.out.println(cadenaValores);
        }
    }

    public void mostrarDer_Izq() {
        if (tamaño != 0) {
            Nodo temporal = UltimoNodo;
            String cadenaValores = "";
            for (int i = tamaño; i > 0; i--) {
                cadenaValores += temporal.dato + "\n";
                temporal = temporal.nodoIzq;
            }
            System.out.println(cadenaValores);
        }
    }
}
