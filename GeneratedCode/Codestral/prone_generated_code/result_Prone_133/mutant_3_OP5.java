import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                break;
            default:
                // This code is executed
                break;
        }
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    private int getUnreachableValue() {
        // This method will always return a value other than 1
        return 0;
    }
}