import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            process(key, value);
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This branch is unreachable as getCondition() always returns false
            System.out.println("This branch should never execute.");
        } else {
            // Placeholder for actual processing code
        }
    }

    private boolean getCondition() {
        return false;
    }
}