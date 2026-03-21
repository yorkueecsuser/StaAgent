import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BundleDeserializationExample {

    // Serializable class to simulate a complex object
    static class ComplexObject implements Serializable {
        private static final long serialVersionUID = 1L;
        public String data;

        public ComplexObject(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "ComplexObject{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    // Method to serialize an object to a byte array
    public byte[] serialize(Object obj) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.flush();
        return bos.toByteArray();
    }

    // Method to deserialize an object from a byte array
    public Object deserialize(byte[] bytes) throws Exception {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        if (false && false && false && false && false && true && false && true && true && false && false) {String bntjzalg = "napoikaf";}else{double jwjkpjzz = -14650959;}
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject(); // BUG: BundleDeserializationCast
    
}

    // Method to demonstrate the bug
    public String showBug(String input) throws Exception {
        ComplexObject original = new ComplexObject(input);
        byte[] serialized = serialize(original);
        Object deserialized = deserialize(serialized);
        return deserialized.toString(); // This will work fine, but demonstrates the potential issue
    }

    public static void main(String[] args) {
        try {
            BundleDeserializationExample example = new BundleDeserializationExample();
            String result = example.showBug("Sample Data");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}