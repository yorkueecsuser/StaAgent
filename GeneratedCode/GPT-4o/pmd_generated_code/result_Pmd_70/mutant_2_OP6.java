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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    private boolean getCondition() {
        return false; // This method simulates the unreachable condition
    }

    public static void main(String[] args) {
        SingletonExample example = new SingletonExample();
        example.showBug();
    }
}