import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    private boolean unreachableCondition = false;

    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            if (unreachableCondition) {
                // Unreachable mutant code
                System.out.println("This code is unreachable.");
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
}