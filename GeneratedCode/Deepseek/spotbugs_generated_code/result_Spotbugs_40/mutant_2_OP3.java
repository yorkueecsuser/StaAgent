import java.io.Serializable;

class SerializationBug implements Serializable {
    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Inserted unreachable if statement
        if (getCondition()) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    // Method to return a false value for the unreachable if statement
    private static boolean getCondition() {
        return false;
    }
}