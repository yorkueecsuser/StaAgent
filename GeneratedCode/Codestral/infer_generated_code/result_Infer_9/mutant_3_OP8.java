import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String k : testMap.keySet()) { // Renamed 'key' to 'k'
            Integer value = testMap.get(k); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            process(k, value);
        }
    }

    public void showBug(HashMap<String, Integer> map) { // Renamed 'testMap' to'map'
        inefficientLoopBad(map);
    }

    private void process(String s, Integer v) { // Renamed 'key' to's' and 'value' to 'v'
        // Placeholder for actual processing code
    }
}