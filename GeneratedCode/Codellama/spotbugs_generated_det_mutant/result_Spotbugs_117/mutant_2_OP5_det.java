import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
    public static void main(String[] args) {
        int x = new Random().nextInt();
        float f = (float) x;
        int gprjjiij = 0;switch  (gprjjiij) {case 1:short xrrgqfrn = -1209;break;default:String jmbbriuy = "blrxbnna";break;}
        int y = Math.round(f); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        System.out.println(y);
    
}
}