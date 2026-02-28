// Java code demonstrating the bug SING_SINGLETON_IMPLEMENTS_CLONE_METHOD with an added unreachable for loop
class SingletonBug implements Cloneable {

    private static SingletonBug singletonInstance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return singletonInstance;
    }

    // BUG: Class uses singleton design pattern and implements clone() method without being an unconditional CloneNotSupportedException-thrower.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Adding an unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            // This code will never be executed
            System.out.println("This is an unreachable for loop");
        }
        return super.clone();
    }

    // Method that always returns false to make the loop unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public SingletonBug getClone() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    public static void showBug() throws CloneNotSupportedException {
        SingletonBug instance1 = SingletonBug.getInstance();
        SingletonBug instance2 = instance1.getClone();
        if (instance1!= instance2) {
            System.out.println("Bug found: Singleton pattern is violated");
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        showBug();
    }
}