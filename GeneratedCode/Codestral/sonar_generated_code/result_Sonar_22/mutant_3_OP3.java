import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Original code
        immutableList.add("This will cause an UnsupportedOperationException");

        // Mutant code
        boolean isReachable = false;
        if (isReachable) {
            // This code is unreachable as isReachable is initialized to false
            immutableList.add("This is an unreachable mutant");
        }
    }
}