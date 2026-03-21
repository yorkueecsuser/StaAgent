import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Base implements Serializable {
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        int byycugsw = 0;switch  (byycugsw) {case 1:float vgbkghuq = -851880374;break;default:int ozbyeckj = 408545168;break;}
        initialize(); // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT) 
    
}

    protected void initialize() {
        System.out.println("Base initialize method");
    }
}

class Derived extends Base {
    private String data;

    public Derived(String data) {
        this.data = data;
    }

    @Override
    protected void initialize() {
        System.out.println("Derived initialize method with data: " + data);
    }

    public String getData() {
        return data;
    }
}

class SerializationExample {

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.close();
        return baos.toByteArray();
    }

    public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    public String showBug() throws IOException, ClassNotFoundException {
        Derived derived = new Derived("Sample Data");
        byte[] serializedData = serialize(derived);
        Derived deserializedDerived = (Derived) deserialize(serializedData);
        return deserializedDerived.getData();
    }

    public static void main(String[] args) {
        try {
            SerializationExample example = new SerializationExample();
            String result = example.showBug();
            System.out.println("Deserialized data: " + result);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}