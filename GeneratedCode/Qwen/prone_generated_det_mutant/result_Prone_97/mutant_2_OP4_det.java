import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        if (true && false && true && false && false && true && true && false && true && false && false) {byte aaadfejl = -13;}else{String zyetmpkq = "tzvkeiyu";}
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