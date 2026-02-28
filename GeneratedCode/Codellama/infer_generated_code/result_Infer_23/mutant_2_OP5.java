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
class UnreachableSwitch {
    private final boolean condition = true;

    public void unreachableSwitch() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            case 2:
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
    }

    private int getValue() {
        return 0;
    }
}