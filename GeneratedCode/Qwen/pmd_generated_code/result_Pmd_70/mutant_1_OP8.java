class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        return singleton;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }

    public static void main(String[] args) {
        showBug();
    }

    // Mutant code starts here
    public static Singleton getUniqueInstance() {
        Singleton x = new Singleton(); // Renamed'singleton' to 'x'
        return x;
    }

    public static void displayBug() {
        Singleton a = Singleton.getUniqueInstance();
        Singleton b = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance a hashcode: " + a.hashCode());
        System.out.println("Instance b hashcode: " + b.hashCode());
    }
}