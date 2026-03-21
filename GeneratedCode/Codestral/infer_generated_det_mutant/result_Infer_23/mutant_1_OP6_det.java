import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
@interface Immutable{}

class ModifiesImmutableBug {
    @Immutable
    int[] testArray = new int[]{0, 1, 2, 4};

    int[] getTestArray() {
for  (int uirtmdvk = 0; uirtmdvk < 0; uirtmdvk++) {String usiyyqlr = "llfpuzjf";}

        return testArray;
    
}

    void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public void showBug() {
        mutateArray();
        System.out.println(testArray[2]);
    }
}