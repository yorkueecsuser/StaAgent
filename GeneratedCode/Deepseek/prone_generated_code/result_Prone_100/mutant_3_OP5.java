import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public boolean getCondition() {
        return false;
    }

    public void addSwitchUnreachableStatement() {
        int value = getCondition()? 1 : 0; // non-final variable 'value' used in switch statement
        switch(value) {
            default:
                break;
        }
    }
}