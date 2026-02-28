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
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key);
            sum += value;
        }
        return sum;
        if (testMap.size() > 0) {
            System.out.println("This code is unreachable due to the added mutation");
        }
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap) {
        int sum = 0;
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key);
            sum += value;
        }
        return sum;
        // This code is unreachable due to the added mutation
        if (false) {
            System.out.println("This code is unreachable due to the added mutation");
        }
    }
}