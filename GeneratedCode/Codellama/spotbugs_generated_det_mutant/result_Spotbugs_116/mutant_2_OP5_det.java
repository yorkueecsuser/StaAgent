import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = (double)x;
        int usxegxrw = 0;switch  (usxegxrw) {case 1:double oovkkicw = -621129475;break;default:long fctliikj = 54845317;break;}
        System.out.println(Math.ceil(y)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}