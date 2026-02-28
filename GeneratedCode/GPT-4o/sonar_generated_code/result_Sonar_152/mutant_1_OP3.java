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
        boolean condition = getFalseCondition(); // using a method to get the false condition
        if (condition) { // unreachable if statement
            System.out.println("This should never print.");
        }
        try (FileOutputStream fileOut = new FileOutputStream("innerClass.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(inner);
            return "Serialization succeeded.";
        } catch (IOException e) {
            return "Serialization failed: " + e.getMessage();
        }
    }

    private boolean getFalseCondition() {
        return false; // the method always returns false, making the if condition unreachable
    }
}