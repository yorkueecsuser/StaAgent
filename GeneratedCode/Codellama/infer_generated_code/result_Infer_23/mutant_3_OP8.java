import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface Immutable {}

@Immutable
class ImmutableClass {
    private final int[] testArray = new int[]{0, 1, 2, 4};

    public int[] getTestArray() {
        return testArray;
    }

    public void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7;
    }
}

@Immutable
class ImmutableClass2 {
    private final int[] testArray2 = new int[]{0, 1, 2, 4};

    public int[] getTestArray2() {
        return testArray2;
    }

    public void mutateArray2() {
        int[] array2 = getTestArray2();
        array2[2] = 7;
    }
}