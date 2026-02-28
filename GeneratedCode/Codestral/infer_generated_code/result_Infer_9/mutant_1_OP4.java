import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // Mutated code to introduce unreachable if-else branch
            if (isUnreachableCondition()) {
                // This branch is unreachable
                unreachableCode();
            } else {
                process(key, value);
            }
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private boolean isUnreachableCondition() {
        // Always returns false to make the condition unreachable
        return false;
    }

    private void unreachableCode() {
        // Placeholder for unreachable code
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }
}