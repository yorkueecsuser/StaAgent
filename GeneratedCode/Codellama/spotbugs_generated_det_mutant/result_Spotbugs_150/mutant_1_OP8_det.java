import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop xywfmzdls (FL_FLOATS_AS_LOOP_COUNTERS)
        double xywfmzdl = input;
        double wfsjudiy = 0;
        while (xywfmzdl > 0) {
            wfsjudiy += xywfmzdl;
            xywfmzdl -= 0.1;
        }
        return wfsjudiy;
    }
}