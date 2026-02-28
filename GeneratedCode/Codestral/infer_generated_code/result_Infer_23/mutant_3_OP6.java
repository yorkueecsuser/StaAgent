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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            // Code inside this loop is unreachable but added to simulate mutation
        }
        int[] array = getTestArray();
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }

    private boolean getCondition() {
        return false; // Returns false to make the loop unreachable
    }
}