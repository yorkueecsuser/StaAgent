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
        mutateArray();
        return testArray;
    }

    // Mutant code: Unreachable switch statement
    public void unreachableSwitchStatement() {
        int value = 3;
        switch(value) {
            case 1:
            case 2:
            case 3:
                break;
            default:
                break;
        }
    }
}