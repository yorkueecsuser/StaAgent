import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int bducacpb = 0;switch  (bducacpb) {case 1:byte wmbssjwq = 108;break;default:String niqdgpuk = "bjdgcruc";break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}