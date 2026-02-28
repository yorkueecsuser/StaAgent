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

    // Method to dynamically get a value for the unreachable switch statement
    private int getUnreachableValue() {
        return -1; // This value does not match any case in the switch statement
    }

    public void unreachableSwitchExample() {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                // No default action
                break;
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.showBug());
        outer.unreachableSwitchExample();
    }
}