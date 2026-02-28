import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This will never be printed");
        }
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
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