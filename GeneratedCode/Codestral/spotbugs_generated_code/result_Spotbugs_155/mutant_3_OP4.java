import java.io.*;

class SingletonBug implements Serializable {
    private static final long serialVersionUID = 1L;
    private static SingletonBug instance = new SingletonBug();

    private SingletonBug() {
    }

    public static SingletonBug getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static boolean getCondition() {
        return false; // Always return false to make the branch unreachable
    }

    public void showBug() throws IOException, ClassNotFoundException {
        // Inserting unreachable if-else branch
        if (getCondition()) {
            System.out.println("This code will never be executed.");
        } else {
            // Original code
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            os.writeObject(this);
            os.close();

            ObjectInputStream is = new ObjectInputStream(new FileInputStream("singleton.ser"));
            SingletonBug deserializedInstance = (SingletonBug) is.readObject();
            is.close();

            System.out.println("Original instance hashCode: " + this.hashCode());
            System.out.println("Deserialized instance hashCode: " + deserializedInstance.hashCode());
        }
    }
}