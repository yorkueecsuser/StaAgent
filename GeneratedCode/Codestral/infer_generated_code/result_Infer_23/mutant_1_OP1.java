import java.lang.annotation.*;
import java.util.Random;

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
        int deadStore = 5; // Dead Store Mutant
        int[] array = getTestArray();
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}