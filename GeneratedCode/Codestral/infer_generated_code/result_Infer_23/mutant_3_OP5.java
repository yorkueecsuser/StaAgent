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

        // Mutant code: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This should never print.");
                    break;
            }
        }
    }

    boolean getCondition() {
        return false;
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}