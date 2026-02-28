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
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE

        // Mutant Code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code block");
        } else {
            int x = 10 / 0; // Intentionally causing an error to simulate unreachable code
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This ensures the if block is always unreachable
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}