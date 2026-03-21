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
        int bdowziet = 0;switch  (bdowziet) {case 1:float dzwkjthz = -244737442;break;default:String zrxwxjjs = "kdfyukdz";break;}
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