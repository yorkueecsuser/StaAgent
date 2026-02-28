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

        // Unreachable while loop
        while (false) {
            // This code is unreachable
            System.out.println("This will never be printed");
        }
    }

    public static void showBug() {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        // Unreachable while loop
        while (false) {
            // This code is unreachable
            System.out.println("This will never be printed");
        }
    }
}