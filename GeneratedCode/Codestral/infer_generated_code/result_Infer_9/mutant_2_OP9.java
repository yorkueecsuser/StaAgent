import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        Iterator<String> iterator = testMap.keySet().iterator();
        if(!iterator.hasNext()) {
            return;
        }
        do {
            String key = iterator.next();
            Integer value = testMap.get(key); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            process(key, value);
        } while(iterator.hasNext());
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String key, Integer value) {
        // Placeholder for actual processing code
    }
}