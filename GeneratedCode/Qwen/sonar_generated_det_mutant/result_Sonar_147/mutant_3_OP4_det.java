import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (false && false && true && true && true && false && true && true && true && false && false) {int nlfdlnia = -337335162;}else{short tftapnat = 5999;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}