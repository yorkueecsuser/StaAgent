import java.util.HashMap;
import java.util.Map;
import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface PerformanceCritical {}

class InefficientKeySetIteratorExample {

    @PerformanceCritical
    public void inefficientLoopBad(HashMap<String, Integer> testMap) {
        for (String key : testMap.keySet()) { // BUG: INEFFICIENT_KEYSET_ITERATOR
            Integer value = testMap.get(key); // extra look-up cost // BUG: INEFFICIENT_KEYSET_ITERATOR
            foo(key, value);
        }

        // Inserting an unreachable switch statement
        int unreachableSwitch = getUnreachableValue(); // Using a method to ensure dynamic evaluation
        switch (unreachableSwitch) {
            case -1:  // This case will never be reached
                System.out.println("Unreachable case executed!");
                break;
            default:
                break;
        }
    }

    public void foo(String key, Integer value) {
        // Example method that does something with the key and value
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }

    // Helper method to ensure the switch condition is dynamically evaluated
    private int getUnreachableValue() {
        // Always returns a value that doesn't match any case in the switch
        return 0;
    }
}