import java.io.Serializable;

class SerializationBug implements Serializable {
    // Original bug: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        if (getCondition()) {
            return readResolve();
        } else {
            // Mutant: Unreachable if-else statement
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                // This code is unreachable and can be anything
                System.out.println("This code is unreachable");
            }
            return null;
        }
    }

    // Helper method to get the condition
    private boolean getCondition() {
        return true;
    }
}