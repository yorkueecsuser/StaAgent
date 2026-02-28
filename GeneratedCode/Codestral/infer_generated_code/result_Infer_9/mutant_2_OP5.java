import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost

            // Added unreachable switch statement
            boolean condition = false;
            int unreachableValue = -1;
            switch (unreachableValue) {
                case 1:
                    // This code will never be executed
                    process(key, value);
                    break;
            }

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