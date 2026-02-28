import java.io.*;

class SingletonBug implements Serializable { // BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
    private static final long serialVersionUID = 1L;
    private static SingletonBug xnstance = new SingletonBug(); // Mutant: Renamed 'instance' to 'xnstance'

    private SingletonBug() {
    }

    public static SingletonBug getInstance() {
        return xnstance; // Updated the return statement to reflect the renamed variable
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void showBug() throws IOException, ClassNotFoundException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        os.writeObject(this);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonBug deserializedXnstance = (SingletonBug) is.readObject(); // Renamed 'deserializedInstance' to 'deserializedXnstance'
        is.close();

        System.out.println("Original xnstance hashCode: " + this.hashCode()); // Updated the print statement to reflect the renamed variable
        System.out.println("Deserialized xnstance hashCode: " + deserializedXnstance.hashCode()); // Updated the print statement to reflect the renamed variable
    }
}