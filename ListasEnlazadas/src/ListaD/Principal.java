/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaD;

public class Principal {

    public static void main(String[] args) {
        ListaD ld = new ListaD();
        ld.agregarAlFinal(13);
        ld.agregarAlFinal(15);
        ld.agregarAlFinal(67);
        ld.agregarAlInicio(90);
        ld.agregarAlInicio(40);
        System.out.println("Tamaño: " + ld.getTamaño());
        ld.mostrarDer_Izq();
        ld.mostrarIzq_Der();
        
        ld.mostrarIzq_Der();
    }
}
