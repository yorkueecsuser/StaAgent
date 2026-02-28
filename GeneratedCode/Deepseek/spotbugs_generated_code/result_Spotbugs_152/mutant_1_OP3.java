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
        // Unreachable if statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This if statement will never be executed
            throw new AssertionError("Unreachable code executed");
        }
        return this.clone();  // Cloning the singleton object
    }

    private boolean getCondition() {
        return false;  // Always return false to make the if statement unreachable
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}