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
    public static double showBugMutant(double input) {
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
            // Unreachable switch statement
            switch(false) {
                case true:
                    sum += counter;
                    break;
                default:
                    counter -= 0.1;
                    sum += counter;
                    break;
            }
        }
        return sum;
    }
}