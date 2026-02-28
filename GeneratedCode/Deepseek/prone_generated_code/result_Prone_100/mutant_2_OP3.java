import java.time.LocalDate;
import java.time.Period;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount
        return buggyDate;
    }

    public LocalDate showMutatedBug() {
        LocalDate date = LocalDate.now();
        boolean condition = getCondition();
        if (condition) { // Added unreachable if branch
            LocalDate mutatedBuggyDate = date.plus(Period.ofDays(1)); // Mutated BUG: LocalDateTemporalAmount
            return mutatedBuggyDate;
        }
        return buggyDate;
    }

    public boolean getCondition() {
        return false; // non-final variable or equivalent method call
    }
}