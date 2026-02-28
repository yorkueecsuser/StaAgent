class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        synchronized (SingletonExample.class) {
            return new SingletonExample(); // BUG: SingletonClassReturningNewInstance
            return new SingletonExample(); // DUPLICATION: Duplicate of the return statement
        }
    }

    public void showBug() {
        SingletonExample instance1 = getInstance();
        SingletonExample instance2 = getInstance();
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        SingletonExample instance3 = getInstance(); // DUPLICATION: Duplicate of the assignment statement
    }

    public static void main(String[] args) {
        SingletonExample example = new SingletonExample();
        example.showBug();
        SingletonExample example2 = new SingletonExample(); // DUPLICATION: Duplicate of the assignment statement
    }
}