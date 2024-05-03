import java.util.Scanner;
import java.util.TreeSet;

public class Apartado6 {
    public static void main(String[] args) {
        TreeSet<String> lista = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1. Introducir cadena");
            System.out.println("2. Eliminar cadena");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(cadena);
                    break;
                case "2":
                    System.out.print("Introduce la cadena a eliminar: ");
                    String cadenaEliminar = scanner.nextLine();
                    if (lista.contains(cadenaEliminar)) {
                        lista.remove(cadenaEliminar);
                    } else {
                        System.out.println("La cadena no se encuentra en la lista.");
                    }
                    break;
                case "3":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Contenido de la lista: " + lista);
        } while (!opcion.equals("3"));
    }
}