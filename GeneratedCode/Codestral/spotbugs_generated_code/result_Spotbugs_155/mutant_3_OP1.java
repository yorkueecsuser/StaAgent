import java.io.*;

class SingletonBug implements Serializable {
    private static final long serialVersionUID = 1L;
    private static SingletonBug instance = new SingletonBug();
    // Added dead store
    private int deadStoreVariable;

    private SingletonBug() {
    }

    public static SingletonBug getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void showBug() throws IOException, ClassNotFoundException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        os.writeObject(this);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonBug deserializedInstance = (SingletonBug) is.readObject();
        is.close();

        // Using the dead store variable
        deadStoreVariable = 10;

        System.out.println("Original instance hashCode: " + this.hashCode());
        System.out.println("Deserialized instance hashCode: " + deserializedInstance.hashCode());
    }
}