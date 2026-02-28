import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.FIELD // for fields
})
@interface Immutable {}

class ImmutableModificationExample {

    @Immutable
    private int[] immutableArray = new int[]{0, 1, 2, 3};

    public int[] getImmutableArray() {
        return immutableArray;
    }

    public void mutateImmutableArray() {
        int[] array = getImmutableArray();
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public int[] showBug() {
        mutateImmutableArray();
        return getImmutableArray();
    }

    public static void main(String[] args) {
        ImmutableModificationExample example = new ImmutableModificationExample();
        int[] modifiedArray = example.showBug();
        for (int value : modifiedArray) {
            System.out.println(value);
        }
    }
}

// Mutant code
class ImmutableModificationExampleMutant {

    @Immutable
    private int[] a = new int[]{0, 1, 2, 3};

    public int[] getA() {
        return a;
    }

    public void mutateA() {
        int[] b = getA();
        b[2] = 7; // BUG: MODIFIES_IMMUTABLE
    }

    public int[] showBugMutant() {
        mutateA();
        return getA();
    }

    public static void main(String[] args) {
        ImmutableModificationExampleMutant exampleMutant = new ImmutableModificationExampleMutant();
        int[] modifiedArrayMutant = exampleMutant.showBugMutant();
        for (int value : modifiedArrayMutant) {
            System.out.println(value);
        }
    }
}