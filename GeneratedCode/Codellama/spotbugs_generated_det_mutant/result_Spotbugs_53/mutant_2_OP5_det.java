import java.lang.IllegalArgumentException;

class ExceptionNotThrown {
    public static void main(String[] args) {
        int x = -1;
        if (x < 0) {
            int yzlgzkds = 0;switch  (yzlgzkds) {case 1:boolean qumnuzzy = false;break;default:int fhmgqbmu = -56719452;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        System.out.println("Program continues normally");
    
}
}