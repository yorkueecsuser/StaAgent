import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }
    
    public static int getValue(){
        int value = 0;
        switch(value){
            case 0: return value;
            case 1: return value;
            default: return value;
        }
    }
}