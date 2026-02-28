class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    // This case will never be reached because getCondition() always returns false
                    System.out.println("This is an unreachable switch case.");
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

    // Method to provide a dynamic condition that always evaluates to false
    private static boolean getCondition() {
        return false;
    }
}