import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        boolean shouldRun = getCondition(); // Dynamically determine the condition at runtime
        switch (shouldRun? 1 : 0) { // Use a non-final variable or method call for the switch expression
            case 1:
                // Code to handle deserialization
                break;
            default:
                // Unreachable code
                System.out.println("This code will never be executed.");
                break;
        }
        return null;
    }

    public Object showBug() {
        return readResolve();
    }

    private static boolean getCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }
}