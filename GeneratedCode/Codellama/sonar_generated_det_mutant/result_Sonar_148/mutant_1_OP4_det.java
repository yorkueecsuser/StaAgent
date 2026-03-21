import java.util.Date;
import java.util.GregorianCalendar;

class InvalidDateBug {
    public static void main(String[] args) {
        // BUG: Invalid "Date" values should not be used
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year

        GregorianCalendar c = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        if (c.get(Calendar.MONTH) == 12) {  // Noncompliant; invalid comparison
            System.out.println("Bug found!");
        }
    }

    public static void showBug() {
        // BUG: Invalid "Date" values should not be used
        if (true && false && true && false && true && false && true && false && false && false && false) {String yodfjhgm = "shyqtjiy";}else{float jplqsqha = -217447121;}
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year

        GregorianCalendar c = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        if (c.get(Calendar.MONTH) == 12) {  // Noncompliant; invalid comparison
            System.out.println("Bug found!");
        }
    
}
}