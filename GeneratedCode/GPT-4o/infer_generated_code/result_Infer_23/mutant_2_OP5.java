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

        // Begin of unreachable switch statement
        int unreachableSwitchVariable = getUnreachableSwitchValue();
        switch (unreachableSwitchVariable) {
            case 100: // Unlikely to be 100
                System.out.println("This will never execute.");
                break;
            // Additional cases can be added for demonstration if needed
        }
        // End of unreachable switch statement
    }

    // Method to return a value that makes switch statement unreachable
    private int getUnreachableSwitchValue() {
        return 101; // Deliberately returning a value not handled in switch
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