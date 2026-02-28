import java.io.Serializable;

class SerializationBug implements Serializable {
    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // Mutant code: Unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This is an unreachable loop");
        }
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the loop unreachable
        return false;
    }
}