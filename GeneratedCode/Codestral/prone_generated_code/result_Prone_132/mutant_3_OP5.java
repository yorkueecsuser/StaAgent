import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        Period period = Period.from(duration);

        boolean condition = false;
        int value = getValue();

        if (condition) {
            switch (value) {
                case 1:
                    // Unreachable code
                    break;
            }
        }

        return period;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}