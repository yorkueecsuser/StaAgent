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
        // Inserting an unreachable while loop
        boolean conditionWhile = getUnreachableCondition(); // This method always returns false
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
        
        for (String key : testMap.keySet()) { // BUG: INEFFICIENT_KEYSET_ITERATOR
            Integer value = testMap.get(key); // extra look-up cost // BUG: INEFFICIENT_KEYSET_ITERATOR
            foo(key, value);
        }
    }

    public void foo(String key, Integer value) {
        // Example method that does something with the key and value
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public void showBug(HashMap<String, Integer> testMap) {
        inefficientLoopBad(testMap);
    }
    
    // Method to provide a false condition for the unreachable loop
    private boolean getUnreachableCondition() {
        return false;
    }
}