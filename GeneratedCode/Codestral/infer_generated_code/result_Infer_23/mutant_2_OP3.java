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

    boolean getCondition() {
        return false;
    }

    void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE

        // Mutated Code: Unreachable if statement
        if (getCondition()) {
            // This code will never run as the condition is always false
            System.out.println("This is an unreachable if statement mutant");
        }
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}