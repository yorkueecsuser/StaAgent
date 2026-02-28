import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        boolean unreachableCondition = false; // Non-final variable used as the loop condition
        while (unreachableCondition) {
            // Unreachable while loop - the loop condition is always false
        }
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            process(key, value);
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }
}