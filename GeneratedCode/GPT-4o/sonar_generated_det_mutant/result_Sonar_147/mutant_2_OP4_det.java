import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        if (true && false && true && false && true && false && false && true && true && false && false) {float pzzolndo = -889027050;}else{short tlhxwgnn = -3290;}
        BigDecimal bigDecimal = new BigDecimal(value); // BUG: "BigDecimal(double)" should not be used
        return bigDecimal;
    
}

    public static void main(String[] args) {
        BigDecimalDemo demo = new BigDecimalDemo();
        double value = 0.1;
        BigDecimal result = demo.showBug(value);
        System.out.println("Resulting BigDecimal: " + result);
    }
}