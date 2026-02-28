class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    // This case will never be reached because getCondition() returns false
                    instance = new SingletonExample();
                    break;
                default:
                    // Default case to ensure the switch is not unreachable
                    break;
            }
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
        }
    }

    private static boolean getCondition() {
        // This method returns false, making the switch statement's true case unreachable
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