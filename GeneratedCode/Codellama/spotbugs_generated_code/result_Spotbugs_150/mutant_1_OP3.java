import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        boolean condition = getCondition();
        if (condition) {
            while (counter > 0) {
                sum += counter;
                counter -= 0.1;
            }
        } else {
            // Unreachable code
            int i = getValue();
            switch (i) {
                case 1:
                    sum += counter;
                    counter -= 0.1;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }

    public static boolean getCondition() {
        // Return a random boolean value
        return Math.random() > 0.5;
    }

    public static int getValue() {
        // Return a random integer value
        return (int) (Math.random() * 10);
    }
}