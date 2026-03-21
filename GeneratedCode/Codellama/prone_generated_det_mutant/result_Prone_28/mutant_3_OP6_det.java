import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        for  (int aaxcgafv = 0; aaxcgafv < 0; aaxcgafv++) {short hozthwmb = -8051;}
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);
    
}
}