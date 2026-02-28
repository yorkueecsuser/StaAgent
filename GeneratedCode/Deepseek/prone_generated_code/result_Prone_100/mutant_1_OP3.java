import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

class LocalDateTemporalAmount {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        LocalDate buggyDate = date.plus(Period.ofDays(1)); // BUG: LocalDateTemporalAmount

        // Mutation Operator name: Unreachable if statement
        // Mutation Operator description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        Random random = new Random();
        boolean condition = random.nextBoolean();
        if (condition!= true) { // This branch is always false
            int unreachableCode = 100; // Unreachable code
        }

        return buggyDate;
    }
}