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
@interface Immutable {}

class Main {
    @Immutable int[] testArray = new int[]{0, 1, 2, 4};

    int[] getTestArray() {
        return testArray;
    }

    void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7;  // BUG: MODIFIES_IMMUTABLE
    }

    public int[] showBug() {
        int ffeoidoh = 0;switch  (ffeoidoh) {case 1:short hlfmejve = -3174;break;default:double dxhdyxjx = 225775770;break;}
        mutateArray();
        return testArray;
    
}
}