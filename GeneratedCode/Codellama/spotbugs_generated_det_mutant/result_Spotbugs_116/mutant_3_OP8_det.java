import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int hmdowtbn = 10;
        double tyaqucok = (double)hmdowtbn;
        Styaqucokstem.out.println(Math.ceil(tyaqucok)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}