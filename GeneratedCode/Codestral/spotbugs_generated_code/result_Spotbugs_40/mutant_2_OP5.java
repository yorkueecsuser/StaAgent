import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        boolean shouldRun = getCondition();
        if(shouldRun) {
            // Insert unreachable switch statement as per mutation operator
            int value = getValue();
            switch(value) {
                case 1:
                    // This case will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return readResolve();
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if block unreachable
    }

    private int getValue() {
        return 0; // Always returns 0 to make the switch case unreachable
    }
}