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

// Duplication Mutation
class SingletonExampleWithDuplication {

    private static SingletonExampleWithDuplication singleton = new SingletonExampleWithDuplication();

    private SingletonExampleWithDuplication() { }

    public static SingletonExampleWithDuplication getInstance() {
        return singleton;
    }

    public static SingletonExampleWithDuplication getInstance(Object obj){
        SingletonExampleWithDuplication singleton = (SingletonExampleWithDuplication) obj;
        SingletonExampleWithDuplication duplicateSingleton = singleton; // Duplicated assignment
        return singleton; // BUG: SingleMethodSingleton
    }

    public void showBug() {
        // Demonstrating the bug by calling the overloaded getInstance method
        SingletonExampleWithDuplication instance1 = getInstance();
        SingletonExampleWithDuplication instance2 = getInstance(new SingletonExampleWithDuplication());

        // Output will show different hash codes, indicating different instances
        System.out.println("Hashcode of instance1: " + instance1.hashCode());
        System.out.println("Hashcode of instance2: " + instance2.hashCode());
    }

    public static void main(String[] args) {
        SingletonExampleWithDuplication example = new SingletonExampleWithDuplication();
        example.showBug();
    }
}