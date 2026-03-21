import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int zxohtdbu = 10;
        double pvrkfqlj = (double)zxohtdbu;
        Spvrkfqljstem.out.println(Math.ceil(pvrkfqlj)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}