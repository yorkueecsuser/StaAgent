import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        if (true && false && false && false && true && true && true && true && true && false && false) {float pgspbwcr = -343326879;}else{float vghoawtu = -744357099;}
        Date sameNow = now; // BUG: JodaToSelf
        return sameNow;
    
}

    public static void main(String[] args) {
        DateTimeExample example = new DateTimeExample();
        Date now = new Date();
        Date result = example.showBug(now);
        System.out.println("Resulting Date: " + result);
    }
}