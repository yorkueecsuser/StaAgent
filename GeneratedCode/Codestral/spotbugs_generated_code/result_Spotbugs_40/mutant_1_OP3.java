import java.io.Serializable;

class SerializationBug implements Serializable {
    // Bug: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    // Mutation Operator: Unreachable if statement
    private boolean getCondition() {
        return false; // Always returns false to create an unreachable if statement
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        if (getCondition()) {
            // Unreachable if statement
            System.out.println("This statement will never be executed.");
        }
        return readResolve();
    }
}