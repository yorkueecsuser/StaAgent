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
        // ADDING MUTANT CODE: Unreachable if statement
        boolean isUnreachable = falseMethod();
        if (isUnreachable) {
            array[2] = 7; // This line is unreachable
        } else {
            array[2] = 7; // BUG: MODIFIES_IMMUTABLE
        }
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }

    // This method is added to ensure that 'isUnreachable' is not a compile-time constant
    private boolean falseMethod() {
        return false;
    }
}