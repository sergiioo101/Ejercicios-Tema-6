import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Apartado11 {
    public static void main(String[] args) {
        try {
            Path rutaArchivoEntrada = Paths.get("archivo_entrada.txt");
            Path rutaArchivoSalida = Paths.get("archivo_salida.txt");

            // Leer todas las líneas del archivo
            List<String> lineas = Files.readAllLines(rutaArchivoEntrada);

            // Ordenar las líneas
            Collections.sort(lineas);

            // Escribir las líneas ordenadas en un nuevo archivo
            Files.write(rutaArchivoSalida, lineas);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
