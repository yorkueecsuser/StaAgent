import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = (double)x;
        boolean oqgllvrd = false;while (oqgllvrd && true && true && true && true && true && true && false && false && true && true && false) {short hfjjinlw = -3119;}
        System.out.println(Math.ceil(y)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}