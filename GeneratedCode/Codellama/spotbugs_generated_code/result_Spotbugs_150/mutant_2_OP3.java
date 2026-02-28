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
}

// Unreachable if statement mutation operator
class UnreachableIfBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
            if (false) {
                // unreachable code
                sum = 0;
            }
        }
        return sum;
    }
}

// Unreachable while loop mutation operator
class UnreachableWhileBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
            while (false) {
                // unreachable code
                sum = 0;
            }
        }
        return sum;
    }
}

// Unreachable for loop mutation operator
class UnreachableForBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
            for (int i = 0; false; i++) {
                // unreachable code
                sum = 0;
            }
        }
        return sum;
    }
}

// Unreachable if-else statement mutation operator
class UnreachableIfElseBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
            if (false) {
                // unreachable code
                sum = 0;
            } else {
                // unreachable code
                sum = 1;
            }
        }
        return sum;
    }
}

// Unreachable switch statement mutation operator
class UnreachableSwitchBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
            switch (0) {
                case 1:
                    // unreachable code
                    sum = 0;
                    break;
                default:
                    // unreachable code
                    sum = 1;
                    break;
            }
        }
        return sum;
    }
}