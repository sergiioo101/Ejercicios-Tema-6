import java.util.ArrayList;
import java.util.Scanner;

public class Apartado4{
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1. Introducir cadena");
            System.out.println("2. Eliminar último dato");
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
                    if (!lista.isEmpty()) {
                        lista.remove(lista.size() - 1);
                    } else {
                        System.out.println("La lista está vacía.");
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
