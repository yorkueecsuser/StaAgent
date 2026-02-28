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
        
        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never execute because getCondition() returns false
            System.out.println("This is an unreachable statement.");
        }

        try (FileOutputStream fileOut = new FileOutputStream("innerClass.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(inner);
            return "Serialization succeeded.";
        } catch (IOException e) {
            return "Serialization failed: " + e.getMessage();
        }
    }
    
    // Method to ensure the condition for the while loop is false
    private boolean getCondition() {
        return false;
    }
}