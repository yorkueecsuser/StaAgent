import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
@interface Immutable{}

class ModifiesImmutableBug {
    @Immutable
    int[] testArray = new int[]{0, 1, 2, 4};

    int[] getTestArray() {
        return testArray;
    }

    void mutateArray() {
        int[] array = getTestArray();
        if (unreachableCondition()) {
            // Mutant: Unreachable if statement
            array[2] = 7;
        }
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    private boolean unreachableCondition() {
        // This condition will always return false
        return 1 == 2;
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}