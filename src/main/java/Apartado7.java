import java.util.HashMap;
import java.util.Map;

public class Apartado7 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("cero", 0);
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        mapa.put("tres", 3);
        mapa.put("cuatro", 4);
        mapa.put("cinco", 5);
        mapa.put("seis", 6);
        mapa.put("siete", 7);
        mapa.put("ocho", 8);
        mapa.put("nueve", 9);
        mapa.put("diez", 10);

        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
