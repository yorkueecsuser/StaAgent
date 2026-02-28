import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Code to handle deserialization
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable and will not execute
        }
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    private static boolean getCondition() {
        return false;
    }
}