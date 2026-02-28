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
        boolean conditionFor = getCondition(); // Method to dynamically determine the condition
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        os.writeObject(this);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonBug deserializedInstance = (SingletonBug) is.readObject();
        is.close();

        System.out.println("Original instance hashCode: " + this.hashCode());
        System.out.println("Deserialized instance hashCode: " + deserializedInstance.hashCode());
    }

    private boolean getCondition() { // Method to dynamically determine the condition
        return false;
    }
}