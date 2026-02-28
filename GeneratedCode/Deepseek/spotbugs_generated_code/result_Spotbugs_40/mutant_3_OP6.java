import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable and will never execute
            System.out.println("This is an unreachable for loop.");
        }

        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    // This method is used to generate a condition for the unreachable for loop
    private static boolean getCondition() {
        return false;
    }
}