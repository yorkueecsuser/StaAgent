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
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap) {
        int sum = 0;
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key);
            sum += value;
        }
        return sum;
    }

    // Mutant code for showBug
    public int showBugMutant(HashMap<String, Integer> testMap) {
        int sum = 0;
        String[] keys = testMap.keySet().toArray(new String[0]);
        int i = 0;
        if(keys.length > 0) {
            do {
                Integer value = testMap.get(keys[i]);
                sum += value;
                i++;
            } while(i < keys.length);
        }
        return sum;
    }

    // Mutant code for showBug1
    public int showBug1Mutant(HashMap<String, Integer> testMap) {
        int sum = 0;
        String[] keys = testMap.keySet().toArray(new String[0]);
        int i = 0;
        if(keys.length > 0) {
            do {
                Integer value = testMap.get(keys[i]);
                sum += value;
                i++;
            } while(i < keys.length);
        }
        return sum;
    }

    // Mutant code for showBug2
    public int showBug2Mutant(HashMap<String, Integer> testMap) {
        int sum = 0;
        String[] keys = testMap.keySet().toArray(new String[0]);
        int i = 0;
        if(keys.length > 0) {
            do {
                Integer value = testMap.get(keys[i]);
                sum += value;
                i++;
            } while(i < keys.length);
        }
        return sum;
    }
}