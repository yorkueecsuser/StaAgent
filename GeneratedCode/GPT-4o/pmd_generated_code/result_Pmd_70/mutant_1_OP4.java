class SingletonExample {

    private static SingletonExample singleton = new SingletonExample();

    private SingletonExample() { }

    public static SingletonExample getInstance() {
        return singleton;
    }

    public static SingletonExample getInstance(Object obj){
        SingletonExample singleton = (SingletonExample) obj;
        return singleton; // BUG: SingleMethodSingleton
    }

    public void showBug() {
        // Demonstrating the bug by calling the overloaded getInstance method
        SingletonExample instance1 = getInstance();
        SingletonExample instance2 = getInstance(new SingletonExample());

        // Output will show different hash codes, indicating different instances
        System.out.println("Hashcode of instance1: " + instance1.hashCode());
        System.out.println("Hashcode of instance2: " + instance2.hashCode());
    }

    public static void main(String[] args) {
        SingletonExample example = new SingletonExample();
        example.showBug();

        // Inserting unreachable if-else branch
        boolean condition = determineCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch.");
        }
    }

    // A method to dynamically determine condition, ensuring no compile-time constant
    private static boolean determineCondition() {
        return false;
    }
}