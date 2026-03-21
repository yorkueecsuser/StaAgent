import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int x = -1;
        if (x < 0) {
            int ptwrfdio = 0;switch  (ptwrfdio) {case 1:double nlhyyzmm = -69397142;break;default:char lgukcdjf = 'j';break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    
}
}