/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Folio
 */
public class Nodo {

    Object dato;
    Nodo nodoDere;
    Nodo nodoIzq;

    public Nodo(Object dato, Nodo nodoDere, Nodo nodoIzq) {
        this.dato = dato;
        this.nodoDere = nodoDere;
        this.nodoIzq = nodoIzq;
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }
}
