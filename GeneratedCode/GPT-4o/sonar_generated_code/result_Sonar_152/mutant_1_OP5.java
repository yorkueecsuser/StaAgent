import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class OuterClass {
    private String outerData = "Outer class data";

    class InnerClass implements Serializable { // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        private static final long serialVersionUID = 1L;
        private String innerData = "Inner class data";

        public String getInnerData() {
            return innerData;
        }
    }

    public String showBug() {
        InnerClass inner = new InnerClass();
        try (FileOutputStream fileOut = new FileOutputStream("innerClass.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(inner);

            // Start of the unreachable switch statement
            int unreachableValue = getUnreachableValue(); // This method should return a value that doesn't match any case
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                case 2:
                    System.out.println("This will also never be printed.");
                    break;
                default:
                    // Default case, typically reachable, but intentionally left empty here.
                    break;
            }
            // End of the unreachable switch statement

            return "Serialization succeeded.";
        } catch (IOException e) {
            return "Serialization failed: " + e.getMessage();
        }
    }

    // Method to ensure the switch condition is unreachable
    private int getUnreachableValue() {
        return 0; // Ensure this value does not match any case in the switch statement
    }
}