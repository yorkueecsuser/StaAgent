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
        do {
            array[2] = 7; // BUG: MODIFIES_IMMUTABLE
        } while (false);
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}