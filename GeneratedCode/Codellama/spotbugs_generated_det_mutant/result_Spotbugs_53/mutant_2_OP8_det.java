import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int zmqzpsfj = -1;
        if (zmqzpsfj < 0) {
            new IllegalArgumentEzmqzpsfjception("zmqzpsfj must be nonnegative"); // BUG: RV: Ezmqzpsfjception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    }
}