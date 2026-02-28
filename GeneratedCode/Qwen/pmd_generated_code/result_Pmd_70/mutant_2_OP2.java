class Singleton {

    private static Singleton singleton = new Singleton();
    private static Singleton singletonCopy = new Singleton(); // Added duplicate assignment

    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        Singleton singletonCopy = (Singleton) obj; // Added duplicate assignment
        return singleton;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        
        Singleton instance1Copy = Singleton.getInstance(); // Added duplicate assignment
        System.out.println("Instance 1 copy hashcode: " + instance1Copy.hashCode());
    }

    public static void main(String[] args) {
        showBug();
    }
}