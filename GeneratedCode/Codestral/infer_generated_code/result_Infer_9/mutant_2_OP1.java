import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // Dead Store mutation: Adding an unused variable declaration
            String unusedVar = "deadstore";
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