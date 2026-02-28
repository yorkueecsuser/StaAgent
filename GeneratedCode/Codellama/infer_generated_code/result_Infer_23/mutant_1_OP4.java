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
}

// Mutation Operator: Unreachable if-else statement
// Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.

@Immutable
class UnreachableIfElseMutant {
    private final int[] testArray = new int[]{0, 1, 2, 4};

    public int[] getTestArray() {
        return testArray;
    }

    public void mutateArray() {
        int[] array = getTestArray();
        if (false) {
            array[2] = 7;
        } else {
            array[2] = 10;
        }
    }
}

// Note: The mutant code is added to the original class, but it is not reachable due to the condition of the if-else statement is always false.