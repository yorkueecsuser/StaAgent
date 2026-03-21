import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int x = -1;
        if (x < 0) {
            if (false && false && true && false && false && true && false && false && false && false && false) {float vqarvqxb = 686728542;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    
}
}