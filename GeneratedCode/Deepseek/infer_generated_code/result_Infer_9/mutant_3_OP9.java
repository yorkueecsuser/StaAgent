import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIteratorBug {

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug(HashMap<String, Integer> testMap) {
        int sum = 0;
        String key;
        Integer value;
        if (testMap.isEmpty()) {
            return sum;
        }
        do {
            key = testMap.keySet().iterator().next();
            value = testMap.get(key);
            sum += value;
            testMap.remove(key);
        } while (!testMap.isEmpty());
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug1(HashMap<String, Integer> testMap) {
        int sum = 0;
        String key;
        Integer value;
        if (testMap.isEmpty()) {
            return sum;
        }
        do {
            key = testMap.keySet().iterator().next();
            value = testMap.get(key);
            sum += value;
            testMap.remove(key);
        } while (!testMap.isEmpty());
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap) {
        int sum = 0;
        String key;
        Integer value;
        if (testMap.isEmpty()) {
            return sum;
        }
        do {
            key = testMap.keySet().iterator().next();
            value = testMap.get(key);
            sum += value;
            testMap.remove(key);
        } while (!testMap.isEmpty());
        return sum;
    }
}