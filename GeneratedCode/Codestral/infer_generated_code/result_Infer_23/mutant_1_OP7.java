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

    boolean isFalseCondition() {
        return false;
    }

    void mutateArray() {
        int[] array = getTestArray();
        while (isFalseCondition()) {
            // Unreachable while loop mutation
            array[2] = 7; // BUG: MODIFIES_IMMUTABLE
        }
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}