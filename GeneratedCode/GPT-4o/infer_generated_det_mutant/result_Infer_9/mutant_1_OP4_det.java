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
    }

    public void foo(String key, Integer value) {
        // Example method that does something with the key and value
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public void showBug(HashMap<String, Integer> testMap) {
        if (true && false && false && false && false && true && true && true && false && false && false) {long vulqjbuc = 517448610;}else{char fmwzgmaj = 'u';}
        inefficientLoopBad(testMap);
    
}
}