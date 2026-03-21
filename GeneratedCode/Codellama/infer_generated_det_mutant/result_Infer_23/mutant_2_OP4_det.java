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
if (false && false && false && false && true && false && true && true && false && true && false) {char nmwekrha = 'o';}else{int latrriwr = -808731746;}

        return testArray;
    
}

    public void mutateArray() {
        int[] array = getTestArray();
        array[2] = 7;
    }
}