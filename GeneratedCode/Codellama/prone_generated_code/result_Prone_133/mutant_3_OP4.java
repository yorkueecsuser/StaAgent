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

// Mutant 1: Unreachable if-else statement
if (false) {
    long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
} else {
    long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit
}

// Mutant 2: Unreachable if-else statement
if (false) {
    long years = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
} else {
    long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
}

// Mutant 3: Unreachable if-else statement
if (false) {
    long years = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
} else {
    long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit
}

// Mutant 4: Unreachable if-else statement
if (false) {
    long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
} else {
    long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit
}