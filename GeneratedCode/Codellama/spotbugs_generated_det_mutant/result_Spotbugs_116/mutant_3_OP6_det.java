import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = (double)x;
        for  (int qmqjyrni = 0; qmqjyrni < 0; qmqjyrni++) {float nfnbahek = 33454813;}
        System.out.println(Math.ceil(y)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}
}