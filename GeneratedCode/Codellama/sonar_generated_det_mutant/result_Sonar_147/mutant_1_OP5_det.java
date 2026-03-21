import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        int oigdzdoc = 0;switch  (oigdzdoc) {case 1:boolean yqyhsirp = true;break;default:float dtzowtra = -291182082;break;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}