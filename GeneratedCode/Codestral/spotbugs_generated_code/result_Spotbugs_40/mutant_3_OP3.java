import java.io.Serializable;

class SerializationBug implements Serializable {
    // Original bug: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Adding unreachable if statement
        if (getFalseCondition()) {
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

    // Helper method to return a false condition
    private static boolean getFalseCondition() {
        return false;
    }
}