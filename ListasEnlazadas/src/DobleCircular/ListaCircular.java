/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DobleCircular;

/**
 *
 * @author Folio
 */

public class ListaCircular {
    Nodo primero;
    Nodo ultimo;

    ListaCircular() {
        primero = null;
        ultimo = null;
    }

    public boolean vacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public ListaCircular alta(int dato) {
        if (vacio()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.fin = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato);
            ultimo.siguiente = nuevo;
            nuevo.fin = ultimo;
            primero.fin = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        return this;
    }

    public boolean bajaxposicion(int dato) {
        Nodo actual = primero;
        Nodo anterior;
        Nodo sigue;
        for (int i = 0; i <= dato; i++) {
            if (actual == ultimo) {
                if (i < dato) {
                    return false;
                } else {
                    if (i == dato) {
                        anterior = actual.fin;
                        anterior.siguiente = primero;
                        primero.fin = anterior;
                        ultimo = anterior;
                        return true;
                    }

                }

            } else {
                if (dato == 0) {
                    sigue = actual.siguiente;
                    sigue.fin = ultimo;
                    ultimo.siguiente = sigue;
                    primero = sigue;
                    return true;
                }
                if (dato == i) {
                    anterior = actual.fin;
                    sigue = actual.siguiente;
                    anterior.siguiente = sigue;
                    sigue.fin = anterior;
                    return true;
                }
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Nodo actual;
        actual = primero;
        while (actual != ultimo) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println(actual.dato);
    }
}
