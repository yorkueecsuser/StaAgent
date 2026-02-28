import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class InefficientKeysetIteratorBug {

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug(HashMap<String, Integer> testMap) {
        int sum = 0;
        Iterator<String> iterator = testMap.keySet().iterator();
        if(iterator.hasNext()) {
            do {
                String key = iterator.next();
                Integer value = testMap.get(key);
                sum += value;
            } while (iterator.hasNext());
        }
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug1(HashMap<String, Integer> testMap) {
        int sum = 0;
        Iterator<String> iterator = testMap.keySet().iterator();
        if(iterator.hasNext()) {
            do {
                String key = iterator.next();
                Integer value = testMap.get(key);
                sum += value;
            } while (iterator.hasNext());
        }
        return sum;
    }

    // BUG: INEFFICIENT_KEYSET_ITERATOR​
    public int showBug2(HashMap<String, Integer> testMap) {
        int sum = 0;
        Iterator<String> iterator = testMap.keySet().iterator();
        if(iterator.hasNext()) {
            do {
                String key = iterator.next();
                Integer value = testMap.get(key);
                sum += value;
            } while (iterator.hasNext());
        }
        return sum;
    }
}