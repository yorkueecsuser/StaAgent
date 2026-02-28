import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        java.util.Iterator<Map.Entry<String, Integer>> iterator = testMap.entrySet().iterator();
        if(iterator.hasNext()) {
            do {
                Map.Entry<String, Integer> entry = iterator.next();
                String key = entry.getKey();
                Integer value = entry.getValue();
                // BUG: INEFFICIENT_KEYSET_ITERATOR
                process(key, value);
            } while(iterator.hasNext());
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }
}