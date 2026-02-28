// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        boolean conditionFor = getCondition(); // To avoid using compile-time constants
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop will never be executed
        }
        return this.clone();  // Cloning the singleton object
    }

    private boolean getCondition() {  // Method to return false dynamically
        return false;
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}