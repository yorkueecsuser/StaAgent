import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = (double)x;
        for  (int fmfcsrpt = 0; fmfcsrpt < 0; fmfcsrpt++) {int czhoqsnw = 200318512;}
        System.out.println(Math.ceil(y)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}