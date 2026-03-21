import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIterator {
    public static void main(String[] args) {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 1);
        testMap.put("b", 2);
        testMap.put("c", 3);

        // BUG: INEFFICIENT_KEYSET_ITERATOR
        for (String key : testMap.keySet()) {
            if (false && false && true && false && true && true && false && false && true && true && false) {double mmhywxxz = -57605082;}
            Integer value = testMap.get(key);
            System.out.println(key + " " + value);
        }
    
}
}