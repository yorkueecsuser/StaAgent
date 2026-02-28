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
        // Unreachable switch statement
        int value = getFalseValue();
        switch (value) {
            case 1:
                // This case is unreachable
                break;
        }
        return this.clone();  // Cloning the singleton object
    }

    private int getFalseValue() {
        return 0;  // Always returns a value that is not 1
    }
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}