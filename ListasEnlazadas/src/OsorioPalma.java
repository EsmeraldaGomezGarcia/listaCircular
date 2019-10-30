/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Folio
 */
public class OsorioPalma {

    public static void main(String[] args) {
        ListaDeObjetos lista = new ListaDeObjetos();

        lista.agregarAlFinal(new Producto(2, 30, "Papas sabritas"));
        lista.agregarAlFinal(new Producto(2, 40, "Coca-Cola 1lt"));
        lista.agregarAlFinal(new Producto(4, 10, "Papas barcel 100 grs"));
        lista.agregarAlFinal(new Producto(2, 30, "BubuLubu"));

        lista.mostrarDer_Izq();
        System.out.println("--------------------------------");
        calcularTotalPagar(lista);
    }

    private static void calcularTotalPagar(ListaDeObjetos lista) {
        int tamaño = lista.getTamaño();
        if (tamaño != 0) {
            Nodo temporal = lista.primerNodo;
            Double totalPagar = 0.0;
            for (int i = 0; i < tamaño; i++) {
                Producto p = (Producto) temporal.dato;
                totalPagar += p.subtotal();
                temporal = temporal.nodoDere;
            }
            System.out.println("Total a pagar: " + totalPagar);
        }
    }
}
