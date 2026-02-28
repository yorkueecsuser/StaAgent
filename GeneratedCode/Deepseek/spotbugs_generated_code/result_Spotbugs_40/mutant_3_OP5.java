import java.io.Serializable;

class SerializationBug implements Serializable {
    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        // Mutation: Unreachable switch statement
        int value = getValue(); // Assume getValue() is a method that returns an integer value
        switch (value) {
            case 0: // This case is unreachable, as getValue() is assumed not to return 0
                System.out.println("Unreachable code.");
                break;
        }
        return readResolve();
    }

    private int getValue() {
        // Implementation of getValue() method
        return 1; // Assuming it will never return 0
    }
}