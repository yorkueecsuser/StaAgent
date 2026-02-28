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

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() throws IOException, ClassNotFoundException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        os.writeObject(this);
        os.close();

        // Inserted unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonBug deserializedInstance = (SingletonBug) is.readObject();
        is.close();

        System.out.println("Original instance hashCode: " + this.hashCode());
        System.out.println("Deserialized instance hashCode: " + deserializedInstance.hashCode());
    }
}