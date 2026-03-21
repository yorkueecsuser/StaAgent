import java.io.Serializable;

class SerializationBug implements Serializable {
    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        double hnfrtwem = 55392511;
        // Code to handle deserialization
        return null;
    
}

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }
}