import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public void unreachableSwitchStatementMutant() {
        boolean shouldRun = getCondition();
        switch (1) {
            case 2:
                if (shouldRun) {
                    // unreachable code
                    System.out.println("This code is unreachable!");
                }
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }
}