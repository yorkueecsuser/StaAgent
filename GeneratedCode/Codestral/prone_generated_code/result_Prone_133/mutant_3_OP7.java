import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        while (getFalseCondition()) {
            // Unreachable code
            System.out.println("This will never be executed");
        }
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    private boolean getFalseCondition() {
        return false;
    }
}