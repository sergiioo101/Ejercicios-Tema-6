import java.util.Random;

public class Apartado3 {
    public static void main(String[] args) {
        Apartado1<Integer>[] parejas = new Apartado1[100];

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numero1 = random.nextInt();
            int numero2 = random.nextInt();
            parejas[i] = new Apartado1<>(numero1, numero2);
        }

        for (Apartado1<Integer> pareja : parejas) {
            System.out.println("Primero: " + pareja.getPrimero() + ", Segundo: " + pareja.getSegundo());
        }
    }
}
