class Singleton {

    private static Singleton singleton = new Singleton();
    private static Singleton singletonDuplicate = new Singleton(); // Mutation: Duplicate assignment

    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        Singleton singletonDuplicate = (Singleton) obj; // Mutation: Duplicate assignment
        return singleton;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        
        Singleton instance1Duplicate = Singleton.getInstance(); // Mutation: Duplicate assignment
        Singleton instance2Duplicate = Singleton.getInstance(new Singleton()); // Mutation: Duplicate assignment
    }

    public static void main(String[] args) {
        showBug();
    }
}