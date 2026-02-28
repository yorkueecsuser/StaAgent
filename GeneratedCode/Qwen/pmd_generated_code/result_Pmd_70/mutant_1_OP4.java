class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (getFalseCondition()) {
                System.out.println("This is an unreachable if block.");
            } else {
                System.out.println("This is an unreachable else block.");
            }
        }
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

    private static boolean getCondition() {
        return true; // This ensures the if block runs
    }

    private static boolean getFalseCondition() {
        return false; // This ensures the if-else blocks are unreachable
    }
}