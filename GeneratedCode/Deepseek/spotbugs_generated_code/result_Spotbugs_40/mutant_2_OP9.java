import java.io.Serializable;

class SerializationBug implements Serializable {
    // Original bug: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    // Mutated code based on the Equivalent Loop Replacement mutation operator
    // Since the original code does not contain any loops, no changes are made here.
}