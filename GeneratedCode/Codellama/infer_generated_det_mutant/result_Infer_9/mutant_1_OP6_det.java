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
            Integer value = testMap.get(key);
            for  (int oyttmqbb = 0; oyttmqbb < 0; oyttmqbb++) {long rrofoeyl = 498098872;}
            System.out.println(key + " " + value);
        }
    
}
}