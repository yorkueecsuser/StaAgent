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
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // Mutated BUG: LocalDateTemporalAmount
        boolean mutantCondition = getMutantCondition();
        // Added mutant code start
        switch(0) {
            case 1:
                mutantCondition = false;
                break;
            default:
                break;
        }
        // Added mutant code end
        return buggyDate;
    }

    private boolean getMutantCondition() {
        return false;
    }
}