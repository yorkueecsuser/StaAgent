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

    boolean alwaysFalse() {
        return false;
    }

    void mutateArray() {
        int[] array = getTestArray();
        // Inserted unreachable for loop
        for (int i = 0; alwaysFalse(); i++) {
            // This block of code is unreachable
            System.out.println("Unreachable code");
        }
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}