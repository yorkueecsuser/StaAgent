import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIteratorBug {

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug(HashMap<String, Integer> testMap) {
        int sum = 0;
        if(false) {
            System.out.println("This branch is unreachable");
        } else {
            for (String key : testMap.keySet()) {
                Integer value = testMap.get(key);
                sum += value;
            }
            return sum;
        }
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug1(HashMap<String, Integer> testMap) {
        int sum = 0;
        if(false) {
            System.out.println("This branch is unreachable");
        } else {
            for (String key : testMap.keySet()) {
                Integer value = testMap.get(key);
                sum += value;
            }
            return sum;
        }
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap) {
        int sum = 0;
        if(false) {
            System.out.println("This branch is unreachable");
        } else {
            for (String key : testMap.keySet()) {
                Integer value = testMap.get(key);
                sum += value;
            }
            return sum;
        }
    }
}