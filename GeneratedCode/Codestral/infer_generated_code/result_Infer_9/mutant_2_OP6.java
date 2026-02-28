import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    private boolean unreachableCondition() {
        return false; // This method always returns false to create unreachable code
    }

    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            process(key, value);

            // Inserting unreachable for loop based on the mutation operator
            for (int i = 0; unreachableCondition(); i++) {
                System.out.println("This code is unreachable");
            }
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }
}