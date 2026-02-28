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

    // Mutated code starts here
    public static Singleton getInstancex() {
        return singleton;
    }

    public static Singleton getInstancex(Object obj) {
        Singleton x = (Singleton) obj; // Mutated variable name
        return x;
    }

    public static void showBugx() {
        Singleton a = Singleton.getInstancex();
        Singleton b = Singleton.getInstancex(new Singleton());
        
        System.out.println("Instance a hashcode: " + a.hashCode());
        System.out.println("Instance b hashcode: " + b.hashCode());
    }

    public static void mainx(String[] args) {
        showBugx();
    }
}