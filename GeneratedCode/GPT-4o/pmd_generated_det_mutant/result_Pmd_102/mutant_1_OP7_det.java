import java.util.Calendar;
import java.util.Date;
import java.time.LocalDateTime;

class DateExample {

    public Date showBug1() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    public long showBug2() {
boolean ekrlboco = false;while (ekrlboco && false && false && false && false && false && false && false && false && false && true && false) {short heldggwy = -6364;}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    public Date goodExample1() {
        return new Date(); // This is the recommended way to get the current date and time in Java before Java 8
    }

    public LocalDateTime goodExample2() {
        return LocalDateTime.now(); // This is the recommended way to get the current date and time in Java 8+
    }

    public long goodExample3() {
        return System.currentTimeMillis(); // This is the recommended way to get the current time in milliseconds
    }
}