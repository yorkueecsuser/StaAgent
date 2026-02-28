// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
        boolean shouldCreateCopy = getCondition();
        for (int i = 0; shouldCreateCopy; i++) {  // Unreachable loop inserted here
            // This loop is unreachable because the condition is always false
        }
        return this.clone();  // Cloning the singleton object
    }

    private boolean getCondition() {
        return false;  // Always returns false, making the loop unreachable
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}