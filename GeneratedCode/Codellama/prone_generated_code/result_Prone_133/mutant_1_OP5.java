import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS);
        long months = period.get(ChronoUnit.MONTHS);
        long days = period.get(ChronoUnit.DAYS);

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

    public static void showBug() {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS);
        long months = period.get(ChronoUnit.MONTHS);
        long days = period.get(ChronoUnit.DAYS);

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

    // Unreachable switch statement mutant
    public static void showBugMutant() {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS);
        long months = period.get(ChronoUnit.MONTHS);
        long days = period.get(ChronoUnit.DAYS);

        switch (period.get(ChronoUnit.SECONDS)) {
            case 1:
                System.out.println("Years: " + years);
                break;
            case 2:
                System.out.println("Months: " + months);
                break;
            case 3:
                System.out.println("Days: " + days);
                break;
            default:
                // Unreachable
                System.out.println("Unreachable");
        }
    }
}