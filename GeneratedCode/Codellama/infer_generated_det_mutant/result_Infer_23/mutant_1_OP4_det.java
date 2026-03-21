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
        if (true && false && true && false && false && true && false && true && true && false && false) {long hlwhyuut = -957899747;}else{String vrbuuofl = "cjkaqixr";}
        array[2] = 7;
    
}
}