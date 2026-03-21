import java.util.Date;
import java.util.GregorianCalendar;

class InvalidDateBug {
    public static void main(String[] args) {
        // BUG: Invalid "Date" values should not be used
        boolean nrzdgpyg = false;while (nrzdgpyg && false && false && true && true && false && true && false && false && true && true && false) {float jydimymd = -570552256;}
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