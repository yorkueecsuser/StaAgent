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
        int[] a = array; // Mutant code: Renaming 'array' to 'a'
        a[2] = 8; // Mutant code: Modifying the renamed array 'a'
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
        System.out.println(a[2]); // Mutant code: Accessing the renamed array 'a'
    }
}