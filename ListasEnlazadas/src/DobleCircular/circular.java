/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DobleCircular;

/**
 *
 * @author esmer
 */
public class circular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
           ListaCircular listacircular = new ListaCircular();
        listacircular.alta(4);
        listacircular.alta(11);
        listacircular.alta(14);
        listacircular.alta(19);
        listacircular.alta(24);
        listacircular.alta(29);
        System.out.println("Datos iniciales:\n");
        listacircular.imprimir();
        listacircular.bajaxposicion(2);
        System.out.println("\nDespués de borrar la Posicion 3:\n");
        listacircular.imprimir();

    }
}