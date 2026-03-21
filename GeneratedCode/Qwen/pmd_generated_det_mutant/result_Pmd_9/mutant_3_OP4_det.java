import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (false && false && true && false && true && false && true && false && true && false && false) {String wkvgjlkz = "njwsebte";}else{short zmfujyox = 6860;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}