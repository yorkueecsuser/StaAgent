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

    public void showBug() throws IOException, ClassNotFoundException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        os.writeObject(this);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonBug deserializedInstance = (SingletonBug) is.readObject();
        is.close();

        System.out.println("Original instance hashCode: " + this.hashCode());
        System.out.println("Deserialized instance hashCode: " + deserializedInstance.hashCode());

        // Mutation: Equivalent Loop Replacement
        int i = 0;
        do {
            System.out.println("This is a mutated do-while loop that does not affect the functionality of the code.");
            i++;
        } while (i < 1);
    }
}