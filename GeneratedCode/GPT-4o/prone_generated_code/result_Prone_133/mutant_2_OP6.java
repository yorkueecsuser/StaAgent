import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);

        // Unreachable for loop introduced here
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This block is unreachable.");
        }

        try {
            return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
    }

    // Helper method to ensure the for loop's condition is false
    private boolean getConditionFor() {
        return false;
    }

    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}