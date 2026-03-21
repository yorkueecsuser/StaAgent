import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop uxkqorsss (FL_FLOATS_AS_LOOP_COUNTERS)
        double uxkqorss = input;
        double fjjfilof = 0;
        while (uxkqorss > 0) {
            fjjfilof += uxkqorss;
            uxkqorss -= 0.1;
        }
        return fjjfilof;
    }
}