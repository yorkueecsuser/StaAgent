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

// Mutant code with a renamed variable
class ImmutableModificationExampleMutant {

    @Immutable
    private int[] b = new int[]{0, 1, 2, 3}; // Renamed 'immutableArray' to 'b'

    public int[] getImmutableArray() {
        return b; // Renamed 'immutableArray' to 'b'
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
        ImmutableModificationExampleMutant example = new ImmutableModificationExampleMutant();
        int[] modifiedArray = example.showBug();
        for (int value : modifiedArray) {
            System.out.println(value);
        }
    }
}