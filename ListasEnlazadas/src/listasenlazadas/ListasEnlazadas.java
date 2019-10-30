package listasenlazadas;

public class ListasEnlazadas {

    public static void main(String[] args) {
        ListaS ls= new ListaS();
        ls.agregar(10);
        ls.agregar(12);
        ls.agregar(20);
        ls.agregar(45);
        System.out.println("Tamaño: " + ls.getTamaño());
        ls.mostrar();
    }
}
