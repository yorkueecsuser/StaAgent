import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost

            // Mutant: Unreachable if statement
            if (isUnreachableCondition()) {
                throw new RuntimeException("This part of the code should be unreachable.");
            }

            process(key, value);
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }

    // This method always returns false to make the if statement unreachable.
    private boolean isUnreachableCondition() {
        return false;
    }
}