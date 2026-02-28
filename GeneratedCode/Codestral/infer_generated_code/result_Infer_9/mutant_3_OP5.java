import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            process(key, value);

            // Mutant code for Unreachable switch statement
            boolean condition = getCondition();
            if (condition) {
                int unreachableValue = getUnreachableValue();
                switch (unreachableValue) {
                    case 1:
                        System.out.println("Unreachable code executed");
                        break;
                }
            }
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }

    private boolean getCondition() {
        return false;
    }

    private int getUnreachableValue() {
        return 2;
    }
}