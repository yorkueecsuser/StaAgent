import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class OuterClass {
    // This outer class is not serializable

    // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    class InnerClass implements Serializable {
        private int data = 42;

        public int getData() {
            return data;
        }
    }

    public Object showBug() {
        InnerClass inner = new InnerClass();
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(inner); // This line will cause a NotSerializableException
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.showBug();
    }
}