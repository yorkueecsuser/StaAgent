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

        // Unreachable if statement added here
        boolean alwaysFalse = determineCondition();
        if (alwaysFalse) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to determine condition, ensuring it is false to make if statement unreachable
    private boolean determineCondition() {
        return false; // This makes the if statement in mutateImmutableArray always false
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