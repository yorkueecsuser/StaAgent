import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
    public static void main(String[] args) {
        int x = new Random().nextInt();
        float f = (float) x;
        for  (int ihsmmbkc = 0; ihsmmbkc < 0; ihsmmbkc++) {long luzxseug = -480937734;}
        int y = Math.round(f); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        System.out.println(y);
    
}
}