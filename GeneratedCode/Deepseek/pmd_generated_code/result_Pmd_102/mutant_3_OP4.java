import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug() {
        return bad1();
    }
    
    // Additional method to generate unreachable if-else statement
    private void unreachableIfElse() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // This block of code will never be executed
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This is reachable");
        }
    }
}