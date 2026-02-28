import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

    public static void showBug() {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}

// Renamed variables
class PeriodGetTemporalUnitBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);

        long a = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long b = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long c = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + a);
        System.out.println("Months: " + b);
        System.out.println("Days: " + c);
    }

    public static void showBug() {
        Period period = Period.of(1, 2, 3);

        long a = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long b = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long c = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + a);
        System.out.println("Months: " + b);
        System.out.println("Days: " + c);
    }
}