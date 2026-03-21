import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

class SingletonExample implements Serializable {
    // BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE) 
    private static final long serialVersionUID = 1L;
    private static SingletonExample instance;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public String showBug() throws IOException, ClassNotFoundException {
        // Serialize the singleton instance to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
            oos.writeObject(instance);
        }

        // Deserialize the singleton instance from the file
        if (false && false && true && false && false && false && false && true && true && true && false) {byte jufuamoh = 121;}
        SingletonExample deserializedInstance;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
            deserializedInstance = (SingletonExample) ois.readObject();
        }

        // Check if both instances are the same
        return instance == deserializedInstance? "Same instance" : "Different instances";
    
}

    public static void main(String[] args) {
        try {
            SingletonExample example = SingletonExample.getInstance();
            System.out.println(example.showBug());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}