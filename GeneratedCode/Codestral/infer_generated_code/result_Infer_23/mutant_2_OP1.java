import java.lang.annotation.*;
import java.util.Random; // Imported for generating random string

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
        int deadStore = generateRandomString(); // Dead Store: Unused variable declaration
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    // Method to generate random string of 8 characters
    private int generateRandomString() {
        Random random = new Random();
        return random.nextInt(99999999); // Generates a random int between 0 and 99999999
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}