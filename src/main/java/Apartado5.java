import java.util.ArrayList;
import java.util.Scanner;

public class Apartado5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
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
                    System.out.print("Introduce la posición: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    if (posicion >= 0 && posicion <= lista.size()) {
                        lista.add(posicion, cadena);
                    } else {
                        System.out.println("Posición no válida.");
                    }
                    break;
                case "2":
                    System.out.print("Introduce la posición de la cadena a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    if (posicionEliminar >= 0 && posicionEliminar < lista.size()) {
                        lista.remove(posicionEliminar);
                    } else {
                        System.out.println("Posición no válida.");
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
