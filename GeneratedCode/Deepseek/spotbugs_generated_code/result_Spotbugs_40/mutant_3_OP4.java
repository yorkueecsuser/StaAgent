import java.io.Serializable;

class SerializationBug implements Serializable {
    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        // Adding unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This statement should never be executed");
        } else {
            return readResolve();
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if block unreachable
        return false;
    }
}