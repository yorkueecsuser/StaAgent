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
        // Unreachable if-else statement mutation
        boolean unreachableCondition = checkCondition();
        if (unreachableCondition) {
            // This branch is unreachable as checkCondition() always returns false
            throw new CloneNotSupportedException("Cloning the singleton object is not supported.");
        } else {
            // Original buggy code
            return this.clone();  // Cloning the singleton object
        }
    }

    // Returns false to make the if branch unreachable
    private boolean checkCondition() {
        return false;
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}