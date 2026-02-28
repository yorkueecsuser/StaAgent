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
        boolean unreachableCondition = getUnreachableCondition();

        if (unreachableCondition) {
            // Unreachable code
            array[2] = 9;
        } else {
            array[2] = 7; // Original bug
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}