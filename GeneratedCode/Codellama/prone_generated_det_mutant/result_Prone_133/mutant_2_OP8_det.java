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

        long tuccwupy = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long hkasyipm = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long pytthfhc = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + tuccwupy);
        System.out.println("Months: " + hkasyipm);
        System.out.println("Days: " + pytthfhc);
    }
}