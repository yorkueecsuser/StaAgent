import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        int rxyanybj = 0;switch  (rxyanybj) {case 1:String vvlxiqam = "elaxyndg";break;default:float spvyqaug = -953288574;break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}
}