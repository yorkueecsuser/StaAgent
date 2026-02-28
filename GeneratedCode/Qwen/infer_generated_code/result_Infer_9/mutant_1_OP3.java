import java.util.HashMap;
import java.util.Map;
import com.facebook.infer.annotation.PerformanceCritical;

class InefficientKeysetIteratorExample {

    @PerformanceCritical
    public void inefficient_loop_bad(HashMap<String, Integer> testMap) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
        
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key); // BUG: INEFFICIENT_KEYSET_ITERATOR
            foo(key, value);
        }
    }

    private void foo(String key, Integer value) {
        // Example method that uses the key and value
        System.out.println("Key: " + key + ", Value: " + value);
    }

    @PerformanceCritical
    public void showBug(HashMap<String, Integer> testMap) {
        inefficient_loop_bad(testMap);
    }

    public static void main(String[] args) {
        InefficientKeysetIteratorExample example = new InefficientKeysetIteratorExample();
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);
        example.showBug(testMap);
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, but it is not a compile-time constant in this context
    }
}