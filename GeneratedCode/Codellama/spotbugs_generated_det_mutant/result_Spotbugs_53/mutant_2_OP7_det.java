import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int x = -1;
        if (x < 0) {
            boolean qwlxeeov = false;while (qwlxeeov && false && true && true && true && false && true && false && true && false && true && false) {boolean cvjxkuvr = false;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    
}
}