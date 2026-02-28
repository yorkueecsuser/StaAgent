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
            return "Serialization succeeded.";
        } catch (IOException e) {
            return "Serialization failed: " + e.getMessage();
        }
    }

    // Mutation: Adding an unreachable if-else branch
    public void unreachableCodeExample() {
        // Using a non-final variable to avoid unreachable statement error
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This branch is always executed.");
        }
    }

    // Helper method to provide a non-final condition
    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if-branch unreachable
    }
}