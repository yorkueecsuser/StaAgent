import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR

            // Adding unreachable for loop
            boolean unreachableCondition = getUnreachableCondition();
            for (int i = 0; unreachableCondition; i++) {
                // This code will never be executed
                System.out.println("Unreachable code");
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

    private boolean getUnreachableCondition() {
        return false;
    }
}