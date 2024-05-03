package Apartado10;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Venta> ventas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1. Introducir venta");
            System.out.println("2. Listar ventas por fecha");
            System.out.println("3. Listar ventas por cliente");
            System.out.println("4. Listar ventas por precio");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Introduce el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Introduce el precio de la transacción: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Introduce la fecha de la transacción (formato YYYY-MM-DD): ");
                    String fechaString = scanner.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaString, DateTimeFormatter.ISO_DATE);
                    ventas.add(new Venta(producto, cliente, precio, fecha));
                    break;
                case "2":
                    System.out.println("Ventas ordenadas por fecha:");
                    for (Venta venta : ventas) {
                        System.out.println(venta);
                    }
                    break;
                case "3":
                    System.out.println("Ventas ordenadas por cliente:");
                    TreeSet<Venta> ventasPorCliente = new TreeSet<>(Comparator.comparing(Venta::getCliente));
                    ventasPorCliente.addAll(ventas);
                    for (Venta venta : ventasPorCliente) {
                        System.out.println(venta);
                    }
                    break;
                case "4":
                    System.out.println("Ventas ordenadas por precio:");
                    TreeSet<Venta> ventasPorPrecio = new TreeSet<>(Comparator.comparing(Venta::getPrecio));
                    ventasPorPrecio.addAll(ventas);
                    for (Venta venta : ventasPorPrecio) {
                        System.out.println(venta);
                    }
                    break;
                case "5":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!opcion.equals("5"));
    }
}
