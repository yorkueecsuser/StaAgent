import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        for  (int gmctnche = 0; gmctnche < 0; gmctnche++) {String juyhzrnx = "qneiwqyy";}
        BigDecimal bd = new BigDecimal(0.1); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}