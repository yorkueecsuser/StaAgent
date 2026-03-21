import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int dipcatyb = 0;switch  (dipcatyb) {case 1:boolean ovvmyqpx = false;break;default:char odpxjuyi = 'r';break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}