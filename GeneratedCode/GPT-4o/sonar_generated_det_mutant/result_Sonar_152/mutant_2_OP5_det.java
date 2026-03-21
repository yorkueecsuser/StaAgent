import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class OuterClass {
    private String nonSerializableData = "Outer class data";

    // Inner class implementing Serializable
    class InnerClass implements Serializable {  // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        private static final long serialVersionUID = 1L;
        private String innerData;

        public InnerClass(String data) {
            this.innerData = data;
        }

        public String getInnerData() {
            return innerData;
        }
    }

    public String showBug(String data) {
        int veodzlpd = 0;switch  (veodzlpd) {case 1:int fqcprrco = -864371055;break;default:boolean rvahzjea = false;break;}
        InnerClass inner = new InnerClass(data);

        try {
            // Attempt to serialize the inner class
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(inner);  // This will throw NotSerializableException
            out.close();
            return "Serialization succeeded";
        } catch (IOException e) {
            return "Serialization failed: " + e.getMessage();
        }
    
}

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.showBug("Inner class data"));
    }
}