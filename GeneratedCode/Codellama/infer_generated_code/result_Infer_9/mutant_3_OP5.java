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
        int value = getValue();
        switch (value) {
        case 1:
            System.out.println("CASE 1");
            break;
        case 2:
            System.out.println("CASE 2");
            break;
        default:
            System.out.println("DEFAULT CASE");
            break;
        }
    }

    private static int getValue() {
        return 0;
    }
}