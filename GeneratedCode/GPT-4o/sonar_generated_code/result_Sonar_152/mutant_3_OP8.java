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
}

// Mutant Code: Renaming a user-defined variable
class OuterClassMutant {
    private String a = "Outer class data";

    class InnerClass implements Serializable {
        private static final long serialVersionUID = 1L;
        private String b = "Inner class data";

        public String getInnerData() {
            return b;
        }
    }

    public String showBug() {
        InnerClass c = new InnerClass();
        try (FileOutputStream d = new FileOutputStream("innerClass.ser");
             ObjectOutputStream e = new ObjectOutputStream(d)) {
            e.writeObject(c);
            return "Serialization succeeded.";
        } catch (IOException f) {
            return "Serialization failed: " + f.getMessage();
        }
    }
}