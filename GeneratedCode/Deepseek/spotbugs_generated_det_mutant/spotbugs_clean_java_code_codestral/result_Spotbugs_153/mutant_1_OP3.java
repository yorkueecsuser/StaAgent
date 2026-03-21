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
        return super.clone();
    }

    public SingletonBug getClone() throws CloneNotSupportedException {
        // Inserted unreachable if branch
        if (getUnreachableCondition()) {
            throw new RuntimeException("This branch should never be reached.");
        }
        return (SingletonBug) clone();
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the inserted branch unreachable
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