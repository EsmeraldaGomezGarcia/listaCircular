
class Producto {

    String nombre = "";
    int cantidad = 0;
    double precio = 0;

    public Producto(int cantidad, double precio, String nombre) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    double subtotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "PRODUCTO: " + nombre + "\nCANTIDAD: " + cantidad + "\nPRECIO UNITARIO: " + precio + "\n\n";
    }

}
