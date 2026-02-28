import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    private boolean buggyDateCondition = true;

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public void unreachableForLoop() {
        boolean unreachableLoopCondition = false;
        for (int i = 0; unreachableLoopCondition; i++) {
            // Unreachable code
        }
    }
}