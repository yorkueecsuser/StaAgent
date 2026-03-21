import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop hjsdwuecs (FL_FLOATS_AS_LOOP_COUNTERS)
        double hjsdwuec = input;
        double klkxvaqm = 0;
        while (hjsdwuec > 0) {
            klkxvaqm += hjsdwuec;
            hjsdwuec -= 0.1;
        }
        return klkxvaqm;
    }
}