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
    }
}

// Mutated Version of the Code
class SingletonExampleMutant {

    private static SingletonExampleMutant a = new SingletonExampleMutant();

    private SingletonExampleMutant() { }

    public static SingletonExampleMutant getInstance() {
        return a;
    }

    public static SingletonExampleMutant getInstance(Object obj){
        SingletonExampleMutant a = (SingletonExampleMutant) obj;
        return a; // BUG: SingleMethodSingleton
    }

    public void showBug() {
        // Demonstrating the bug by calling the overloaded getInstance method
        SingletonExampleMutant instance1 = getInstance();
        SingletonExampleMutant instance2 = getInstance(new SingletonExampleMutant());

        // Output will show different hash codes, indicating different instances
        System.out.println("Hashcode of instance1: " + instance1.hashCode());
        System.out.println("Hashcode of instance2: " + instance2.hashCode());
    }

    public static void main(String[] args) {
        SingletonExampleMutant example = new SingletonExampleMutant();
        example.showBug();
    }
}