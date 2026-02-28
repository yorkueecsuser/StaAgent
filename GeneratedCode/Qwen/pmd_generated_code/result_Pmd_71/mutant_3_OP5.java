class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            // Inserting an unreachable switch statement
            boolean alwaysFalse = getAlwaysFalse();
            switch (alwaysFalse) {
                case true:
                    // This case is unreachable because alwaysFalse is always false
                    System.out.println("This will never be printed");
                    break;
            }
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
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

    // Method to provide a dynamically determined false value
    private static boolean getAlwaysFalse() {
        return false;
    }
}