import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            // Mutant: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code is unreachable
                System.out.println("This code is unreachable");
            } else {
                process(key, value);
            }
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }

    private boolean getUnreachableCondition() {
        // Placeholder for actual condition
        return false;
    }
}