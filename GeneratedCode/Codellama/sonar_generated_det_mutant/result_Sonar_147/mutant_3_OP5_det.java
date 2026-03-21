import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        int ooygrlmq = 0;switch  (ooygrlmq) {case 1:String tfausipn = "civsonay";break;default:boolean oomopenq = true;break;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}