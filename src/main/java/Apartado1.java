public class Apartado1<T> {
    private T primero;
    private T segundo;

    public Apartado1(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }
}
