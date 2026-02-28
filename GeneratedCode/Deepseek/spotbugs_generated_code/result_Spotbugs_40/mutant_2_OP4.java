import java.io.Serializable;

class SerializationBug implements Serializable {
    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Added mutant code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable as getUnreachableCondition() always returns false
            System.out.println("This is an unreachable block of code.");
        }
        // Code to handle deserialization
        return null;
    }

    private static boolean getUnreachableCondition() {
        // This method always returns false to make the if-else statement unreachable
        return false;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }
}