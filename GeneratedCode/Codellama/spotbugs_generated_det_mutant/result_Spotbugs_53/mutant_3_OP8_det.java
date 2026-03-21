import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int kaxfzxpj = -1;
        if (kaxfzxpj < 0) {
            new IllegalArgumentEkaxfzxpjception("kaxfzxpj must be nonnegative"); // BUG: RV: Ekaxfzxpjception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    }
}