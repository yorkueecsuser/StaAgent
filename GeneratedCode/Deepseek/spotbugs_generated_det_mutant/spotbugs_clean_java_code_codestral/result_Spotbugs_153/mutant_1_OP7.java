// Java code demonstrating the bug SING_SINGLETON_IMPLEMENTS_CLONE_METHOD
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
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop is unreachable, but it should not cause compilation errors
        }
        return super.clone();
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

    private static boolean getUnreachableCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}