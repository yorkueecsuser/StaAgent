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
        int thvkxzja = 0;switch  (thvkxzja) {case 1:double xylbjrsg = -252912450;break;default:boolean hriqsqrh = false;break;}
        int[] array = getTestArray();
        array[2] = 7;
    
}
}