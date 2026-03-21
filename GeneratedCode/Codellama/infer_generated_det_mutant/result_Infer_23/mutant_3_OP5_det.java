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
        int anjcmihy = 0;switch  (anjcmihy) {case 1:float unxaoxxf = 63360879;break;default:char tcfgyaza = 'h';break;}
        int[] array = getTestArray();
        array[2] = 7;
    
}
}