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
    }
}

// MUTANT 1: Renaming `testMap` to `map`
HashMap<String, Integer> map = new HashMap<>();
map.put("a", 1);
map.put("b", 2);
map.put("c", 3);

for (String key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println(key + " " + value);
}

// MUTANT 2: Renaming `key` to `k`
HashMap<String, Integer> testMap = new HashMap<>();
testMap.put("a", 1);
testMap.put("b", 2);
testMap.put("c", 3);

for (String k : testMap.keySet()) {
    Integer value = testMap.get(k);
    System.out.println(k + " " + value);
}

// MUTANT 3: Renaming `value` to `val`
HashMap<String, Integer> testMap = new HashMap<>();
testMap.put("a", 1);
testMap.put("b", 2);
testMap.put("c", 3);

for (String key : testMap.keySet()) {
    Integer val = testMap.get(key);
    System.out.println(key + " " + val);
}