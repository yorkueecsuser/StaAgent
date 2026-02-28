import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String k : testMap.keySet()) {
            Integer v = testMap.get(k); // extra look-up cost
            // BUG: INEFFICIENT_KEYSET_ITERATOR
            process(k, v);
        }
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    private void process(String k, Integer v) {
        // Placeholder for actual processing code
    }

    // Mutant code added:
    public void mutantCode(HashMap<String, Integer> map) {
        for (String y : map.keySet()) {
            Integer z = map.get(y); // extra look-up cost
            // Introducing a new variable naming scheme
            process(y, z);
        }
    }
}