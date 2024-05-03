package Apartado10;
import java.time.LocalDate;

public class Venta implements Comparable<Venta> {
    private String producto;
    private String cliente;
    private double precio;
    private LocalDate fecha;

    public Venta(String producto, String cliente, double precio, LocalDate fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public String getCliente() {
        return cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Venta otraVenta) {
        return this.fecha.compareTo(otraVenta.getFecha());
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Cliente: " + cliente + ", Precio: " + precio + ", Fecha: " + fecha;
    }
}
