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
            System.out.println(key + " " + value);
        }

        // Mutant 1: Unreachable switch statement
        int mutant = 1;
        switch (mutant) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}