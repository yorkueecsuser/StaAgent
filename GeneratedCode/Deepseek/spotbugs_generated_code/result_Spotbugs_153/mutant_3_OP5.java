// Java code demonstrating the bug SING_SINGLETON_IMPLEMENTS_CLONE_METHOD with additional unreachable switch statement
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
        return (SingletonBug) clone();
    }

    // Mutated code: Unreachable switch statement
    private void unreachableSwitchStatement() {
        boolean shouldRun = false;
        int value = 0;
        if (shouldRun) {
            value = getRandomValue();
        }
        switch (value) {
            case 1:
                System.out.println("This case will never be reached.");
                break;
            default:
                System.out.println("Default case.");
        }
    }

    private int getRandomValue() {
        return 0; // This method always returns 0, making the switch statement unreachable
    }

    public static void showBug() throws CloneNotSupportedException {
        SingletonBug instance1 = SingletonBug.getInstance();
        SingletonBug instance2 = instance1.getClone();
        if (instance1!= instance2) {
            System.out.println("Bug found: Singleton pattern is violated");
        }
        instance1.unreachableSwitchStatement(); // Calling the method with unreachable switch statement
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        showBug();
    }
}