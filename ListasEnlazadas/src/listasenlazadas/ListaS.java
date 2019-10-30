package listasenlazadas;

public class ListaS {

    private Nodo primerNodo;
    private Nodo UltimoNodo;
    private int tamaño;

    public ListaS(Nodo primerNodo, Nodo UltimoNodo, int tamaño) {
        this.primerNodo = null;
        this.UltimoNodo = null;
        this.tamaño = 0;
    }

    public ListaS() {

    }

    public ListaS agregar(int dato) {
        if (validar()) {
            Nodo nuevo = new Nodo(dato);
            primerNodo = nuevo;
            UltimoNodo = nuevo;
            nuevo.nodoDere = null;
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDere = null;
            UltimoNodo.nodoDere = nuevo;
            UltimoNodo= nuevo;
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
    
    public void mostrar(){
        if (tamaño != 0) {
            Nodo temporal = primerNodo;
            String cadenaValores="";
            for (int i = 0; i < this.tamaño; i++) {
                cadenaValores += temporal.dato+" \n";
                temporal= temporal.nodoDere;
            }
            System.out.println(cadenaValores);
        }
    }
}
