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
        array[2] = 7; // Bug: MODIFIES_IMMUTABLE
        array[2] = 7; // Mutant: Duplication of the assignment statement
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}