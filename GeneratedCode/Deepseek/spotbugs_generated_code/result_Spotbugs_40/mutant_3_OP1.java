import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Dead store
        int qwertyui = 0;
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }
}