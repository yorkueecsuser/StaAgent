class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            // Introduced an unreachable for loop as per the mutation operator
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because getCondition() always returns false
            }
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
        }
    }

    // Method to provide a dynamic condition for the loop
    private static boolean getCondition() {
        return false;
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