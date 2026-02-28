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
    public int showBug1(HashMap<String, Integer> qwerty) {
        int sum = 0;
        for (String key : qwerty.keySet()) {
            Integer value = qwerty.get(key);
            sum += value;
        }
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> asdfgh) {
        int sum = 0;
        for (String key : asdfgh.keySet()) {
            Integer value = asdfgh.get(key);
            sum += value;
        }
        return sum;
    }
}