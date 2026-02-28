// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {

    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        if (isUnreachableCondition()) { // Inserted unreachable if statement
            throw new CloneNotSupportedException("Cloning of SingletonClass is not supported.");
        }
        return this.clone();  // Cloning the singleton object
    }

    private boolean isUnreachableCondition() {
        return false; // Always false to make the if statement unreachable
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}