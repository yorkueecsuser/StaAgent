import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    // Mutant code added
    private Object renamedMethod() {
        // This method is a renamed version of readResolve, but it doesn't contain the bug
        return null;
    }
}