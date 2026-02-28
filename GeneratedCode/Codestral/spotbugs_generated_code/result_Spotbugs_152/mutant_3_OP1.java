// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    // Dead Store: Inserting an unused int variable declaration
    private int deadStoreVariable;

    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();  // Cloning the singleton object
    }

    // Overriding clone method to unconditionally throw CloneNotSupportedException
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not supported for Singleton class");
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}