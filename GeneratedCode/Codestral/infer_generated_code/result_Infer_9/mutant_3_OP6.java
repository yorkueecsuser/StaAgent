import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        // Added unreachable for loop as per mutation operator
        for (int i = 0; isConditionMet(); i++) {
            // This loop is unreachable because isConditionMet() always returns false
            System.out.println("This line should never execute");
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

    // Fictional method that always returns false
    private boolean isConditionMet() {
        return false;
    }
}