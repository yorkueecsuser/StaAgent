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
            int ogxzsetw = 0;switch  (ogxzsetw) {case 1:byte jqecjdar = -14;break;default:short evswsqvn = 4003;break;}
            System.out.println(key + " " + value);
        }
    
}
}