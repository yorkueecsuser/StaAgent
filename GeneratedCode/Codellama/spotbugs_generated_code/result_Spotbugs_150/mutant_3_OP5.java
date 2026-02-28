import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
        }
        return sum;
    }

    // Unreachable switch statement mutant
    public static double showBug(double input) {
        double counter = input;
        double sum = 0;
        boolean condition = getCondition();
        switch (condition) {
            case 1:
                sum += counter;
                counter -= 0.1;
                break;
            default:
                break;
        }
        return sum;
    }
}