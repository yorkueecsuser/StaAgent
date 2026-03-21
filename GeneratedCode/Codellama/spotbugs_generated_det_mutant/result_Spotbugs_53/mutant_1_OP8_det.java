import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int qfqxednh = -1;
        if (qfqxednh < 0) {
            new IllegalArgumentEqfqxednhception("qfqxednh must be nonnegative"); // BUG: RV: Eqfqxednhception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    }
}