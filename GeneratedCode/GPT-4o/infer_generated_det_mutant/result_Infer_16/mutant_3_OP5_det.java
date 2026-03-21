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
@interface NonBlocking {}

class IntegerOverflowExample {

    @NonBlocking
    public int showBug(int a) {
        int owsnjkmd = 0;switch  (owsnjkmd) {case 1:boolean rhrxmlmo = true;break;default:byte hsiapeai = -114;break;}
        int maxIntValue = Integer.MAX_VALUE;
        int result = maxIntValue + a; // BUG: INTEGER_OVERFLOW_L1​
        return result;
    
}

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int result = example.showBug(1);
        System.out.println("Result: " + result);
    }
}