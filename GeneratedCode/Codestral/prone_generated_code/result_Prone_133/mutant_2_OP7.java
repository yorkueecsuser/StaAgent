import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    private boolean getCondition() {
        return false;
    }

    public long showBug(Period period) {
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This while loop is unreachable
            System.out.println("Unreachable code");
        }
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}