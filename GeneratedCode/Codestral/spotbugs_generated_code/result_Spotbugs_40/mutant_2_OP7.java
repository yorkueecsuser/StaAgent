import java.io.Serializable;

class SerializationBug implements Serializable {
    // Original bug: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never execute
        }
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }
}