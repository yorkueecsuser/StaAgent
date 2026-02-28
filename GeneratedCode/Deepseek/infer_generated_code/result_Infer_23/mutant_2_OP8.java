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
    @Immutable int[] immutableArray = new int[]{0, 1, 2, 4};

    int[] getImmutableArray() {
        return immutableArray;
    }

    void mutateArray() {
        int[] array = getImmutableArray();
        array[2] = 7;  // BUG: MODIFIES_IMMUTABLE
    }

    public int[] showBug() {
        mutateArray();
        return immutableArray;
    }
}