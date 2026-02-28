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
    public int showBug1(HashMap<String, Integer> dummyMap) {
        int total = 0;
        for (String dummyKey : dummyMap.keySet()) {
            Integer dummyValue = dummyMap.get(dummyKey);
            total += dummyValue;
        }
        return total;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap2) {
        int sum2 = 0;
        for (String key2 : testMap2.keySet()) {
            Integer value2 = testMap2.get(key2);
            sum2 += value2;
        }
        return sum2;
    }
}