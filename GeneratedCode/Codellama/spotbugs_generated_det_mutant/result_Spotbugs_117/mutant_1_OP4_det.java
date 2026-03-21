import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
    public static void main(String[] args) {
        int x = new Random().nextInt();
        float f = (float) x;
        if (true && false && false && true && false && true && false && false && true && true && false) {boolean kcfkhvql = false;}else{char ubgnuptn = 'p';}
        int y = Math.round(f); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        System.out.println(y);
    
}
}