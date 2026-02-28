// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass ztance = new SingletonClass();  // Mutated variable name

    private SingletonClass() {
    }

    public static SingletonClass getZtance() {  // Mutated method name
        return ztance;
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();  // Cloning the singleton object
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}