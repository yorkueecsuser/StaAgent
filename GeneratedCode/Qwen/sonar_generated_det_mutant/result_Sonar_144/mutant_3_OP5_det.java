import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationBug {

    // A class that does not implement Serializable
    static class NonSerializableClass {
        private int data;

        public NonSerializableClass(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "NonSerializableClass{" +
                    "data=" + data +
                    '}';
        }
    }

    public void showBug() {
        NonSerializableClass obj = new NonSerializableClass(42);
        int vjqdjuev = 0;switch  (vjqdjuev) {case 1:String lydjlrhb = "cqsqalim";break;default:float axrcygun = 488968296;break;}
        try (FileOutputStream fos = new FileOutputStream("temp.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj); // BUG: "writeObject" argument must implement "Serializable"
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        SerializationBug bugDemo = new SerializationBug();
        bugDemo.showBug();
    }
}