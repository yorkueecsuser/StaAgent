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
            // Unreachable for loop
            boolean unreachableCondition = getUnreachableCondition();
            for (int i = 0; unreachableCondition; i++) {
                System.out.println("This loop is unreachable.");
            }
            
            out.writeObject(inner);
            return "Serialization succeeded.";
        } catch (IOException e) {
            return "Serialization failed: " + e.getMessage();
        }
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}