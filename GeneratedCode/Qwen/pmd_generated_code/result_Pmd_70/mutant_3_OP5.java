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

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is never reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case
                break;
        }
    }

    public static void main(String[] args) {
        showBug();
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}