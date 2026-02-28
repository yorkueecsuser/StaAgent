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

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}