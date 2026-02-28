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

        boolean isUnreachable = false; // Condition is always false for unreachable branch
        if (isUnreachable) {
            System.out.println("This code will never be reached");
        } else {
            // This is the original code branch
        }
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}