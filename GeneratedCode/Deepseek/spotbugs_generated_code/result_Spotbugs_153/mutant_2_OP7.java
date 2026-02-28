// Java code demonstrating the bug SING_SINGLETON_IMPLEMENTS_CLONE_METHOD with an unreachable while loop
class SingletonBug implements Cloneable {

    private static SingletonBug singletonInstance = new SingletonBug();

    private SingletonBug() {
        // Private constructor to restrict new instances
    }

    public static SingletonBug getInstance() {
        return singletonInstance;
    }

    // BUG: Class uses singleton design pattern and implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Adding unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute as the condition is always false
        }
        return super.clone();
    }

    public SingletonBug getClone() throws CloneNotSupportedException {
        return (SingletonBug) clone();
    }

    // Method to check condition
    private boolean getCondition() {
        return false;
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