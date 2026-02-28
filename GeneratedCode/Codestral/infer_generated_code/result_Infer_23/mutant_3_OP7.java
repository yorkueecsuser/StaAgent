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
        boolean conditionWhile = getCondition(); // Added line
        while (conditionWhile) { // Mutation
            System.out.println("This line will never be executed.");
        }
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    private boolean getCondition() { // Added method
        return false;
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}