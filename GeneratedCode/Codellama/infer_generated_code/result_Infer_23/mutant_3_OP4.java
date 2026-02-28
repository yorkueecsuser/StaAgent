import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface Immutable {}

@Immutable
class ImmutableClass {
    private final int[] testArray = new int[]{0, 1, 2, 4};

    public int[] getTestArray() {
        return testArray;
    }

    public void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7;
    }

    // Unreachable if-else statement
    public void unreachableIfElse() {
        boolean condition = true;
        if (condition) {
            // do something
        } else {
            // do something else
        }
    }
}