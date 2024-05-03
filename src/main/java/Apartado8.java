import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Apartado8 {
    public static void main(String[] args) {
        HashMap<Integer, Character> mapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1. Introducir par número/letra");
            System.out.println("2. Recuperar letra");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce un número: ");
                    int numero = scanner.nextInt();
                    System.out.print("Introduce una letra: ");
                    char letra = scanner.next().charAt(0);
                    mapa.put(numero, letra);
                    break;
                case "2":
                    System.out.print("Introduce el número de la letra a recuperar: ");
                    int numeroRecuperar = scanner.nextInt();
                    if (mapa.containsKey(numeroRecuperar)) {
                        System.out.println("La letra correspondiente al número " + numeroRecuperar + " es " + mapa.get(numeroRecuperar));
                    } else {
                        System.out.println("No existe una letra para el número introducido.");
                    }
                    break;
                case "3":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            scanner.nextLine(); // consume the newline
        } while (!opcion.equals("3"));
    }
}
