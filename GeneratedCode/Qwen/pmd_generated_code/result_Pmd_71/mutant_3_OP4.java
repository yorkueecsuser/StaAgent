class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            boolean condition = getCondition();
            if (condition) {
                // This block is intended to be unreachable
                return new SingletonExample();
            } else {
                // Original code remains unchanged
                return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
            }
        }
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

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This will always return false, making the if block unreachable
    }
}