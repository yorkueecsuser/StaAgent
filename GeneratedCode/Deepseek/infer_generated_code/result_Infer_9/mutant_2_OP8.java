import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIteratorBug {

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug(HashMap<String, Integer> testMap) {
        int sum = 0;
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key);
            sum += value;
        }
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug1(HashMap<String, Integer> testMap) {
        int sum = 0;
        for (String k : testMap.keySet()) {
            Integer v = testMap.get(k);
            sum += v;
        }
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap) {
        int b = 0;
        for (String a : testMap.keySet()) {
            Integer c = testMap.get(a);
            b += c;
        }
        return b;
    }
}