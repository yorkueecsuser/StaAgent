class PeriodGetTemporalUnitBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);

        long years = period.get(ChronoUnit.YEARS); // BUG: PeriodGetTemporalUnit
        long months = period.get(ChronoUnit.MONTHS); // BUG: PeriodGetTemporalUnit
        long days = period.get(ChronoUnit.DAYS); // BUG: PeriodGetTemporalUnit

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        // Unreachable if-else statement
        if (false) {
            years = period.get(ChronoUnit.YEARS);
        } else {
            months = period.get(ChronoUnit.MONTHS);
            days = period.get(ChronoUnit.DAYS);
        }

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

        // Unreachable if-else statement
        if (false) {
            years = period.get(ChronoUnit.YEARS);
        } else {
            months = period.get(ChronoUnit.MONTHS);
            days = period.get(ChronoUnit.DAYS);
        }

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}