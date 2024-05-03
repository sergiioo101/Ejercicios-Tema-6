package Apartado9;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Persona> personas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1. Introducir persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el apellido: ");
                    String apellido = scanner.nextLine();
                    personas.add(new Persona(nombre, apellido));
                    break;
                case "2":
                    System.out.println("Personas:");
                    for (Persona persona : personas) {
                        System.out.println(persona);
                    }
                    break;
                case "3":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!opcion.equals("3"));
    }
}
