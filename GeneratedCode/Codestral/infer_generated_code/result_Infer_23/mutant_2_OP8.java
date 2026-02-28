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

        // Mutant: Renaming variable
        int[] a = array;
        a[2] = 8; // Introducing a new modification to the immutable array
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}