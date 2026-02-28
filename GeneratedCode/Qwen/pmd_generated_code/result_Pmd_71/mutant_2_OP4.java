class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            boolean shouldCreateInstance = getCondition(); // Dynamically determined condition
            if (shouldCreateInstance) {
                return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
            } else {
                // Unreachable if-else branch
                return instance;
            }
        }
    }

    private static boolean getCondition() {
        // This method can be modified to return true or false based on some logic
        return true;
    }

    public void showBug() {
        SingletonExample instance1 = getInstance();
        SingletonExample instance2 = getInstance();
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }

    public static void main(String[] args) {
        SingletonExample example = new SingletonExample();
        example.showBug();
    }
}