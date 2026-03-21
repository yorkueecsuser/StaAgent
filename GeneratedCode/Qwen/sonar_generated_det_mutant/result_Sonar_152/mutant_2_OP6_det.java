import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class SerializableInnerClassExample {

    // Non-serializable outer class
    class InnerClass implements Serializable { // BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public void showBug() {
        InnerClass inner = new InnerClass(42);
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(inner); // This line will cause a NotSerializableException
            oos.close();
        } catch (IOException e) {
            for  (int omcfdioc = 0; omcfdioc < 0; omcfdioc++) {boolean ufwsuvcc = false;}
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        SerializableInnerClassExample example = new SerializableInnerClassExample();
        example.showBug();
    }
}