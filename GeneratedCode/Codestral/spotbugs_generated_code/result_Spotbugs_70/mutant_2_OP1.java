import java.util.*;

class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Introducing a dead store
        Integer unusedVariable = new Random().nextInt();

        // Original bug: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    }
}