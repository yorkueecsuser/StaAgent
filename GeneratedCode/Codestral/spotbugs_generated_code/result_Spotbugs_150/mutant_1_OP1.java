import java.util.*;

class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        int deadStoreVariable = 0; // Added dead store variable
        for (float i = 0.0f; i < limit; i += 0.1f) { // Original bug remains: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    }
}