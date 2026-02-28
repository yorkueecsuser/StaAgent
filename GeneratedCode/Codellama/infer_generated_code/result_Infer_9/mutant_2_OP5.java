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

        // MUTANT: UNREACHABLE_SWITCH_STATEMENT
        switch (false) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            case 2:
                System.out.println("This branch is also unreachable");
                break;
            default:
                System.out.println("This default branch is also unreachable");
        }
    }
}