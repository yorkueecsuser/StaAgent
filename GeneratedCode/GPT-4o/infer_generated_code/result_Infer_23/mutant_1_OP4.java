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
        // Inserting an unreachable if-else statement
        boolean alwaysFalse = getAlwaysFalse();
        if (alwaysFalse) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("The unreachable branch was skipped.");
        }

        mutateImmutableArray();
        return getImmutableArray();
    }

    // Helper method to ensure the condition is evaluated at runtime
    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        ImmutableModificationExample example = new ImmutableModificationExample();
        int[] modifiedArray = example.showBug();
        for (int value : modifiedArray) {
            System.out.println(value);
        }
    }
}