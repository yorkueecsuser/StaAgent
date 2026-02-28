import java.io.*;

class NonSerializableOuterClass {
    private String outerData = "Outer Class Data";

    class NonStaticInnerClass implements Serializable {
        private String innerData = "Inner Class Data";
        // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }

    public void showBug() {
        NonStaticInnerClass innerClass = new NonStaticInnerClass();
        try {
            FileOutputStream fileOut = new FileOutputStream("innerClass.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(innerClass);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in innerClass.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NonSerializableOuterClass outerClass = new NonSerializableOuterClass();
        outerClass.showBug();
    }
}