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

        // Mutation Operator: Unreachable for loop
        // Description: Inserting unreachable for loop into a randomly selected basic block in the program.
        // The condition of the inserted loop is always false to make it unreachable.
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code
        }
    }
}