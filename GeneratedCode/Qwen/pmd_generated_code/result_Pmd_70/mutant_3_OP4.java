class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code due to shouldRun always being false
            System.out.println("This is an unreachable if block in getInstance()");
        } else {
            // This else block is also unreachable due to shouldRun always being false
            System.out.println("This is an unreachable else block in getInstance()");
        }
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code due to shouldRun always being false
            System.out.println("This is an unreachable if block in getInstance(Object)");
        } else {
            // This else block is also unreachable due to shouldRun always being false
            System.out.println("This is an unreachable else block in getInstance(Object)");
        }
        return singleton;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code due to shouldRun always being false
            System.out.println("This is an unreachable if block in showBug()");
        } else {
            // This else block is also unreachable due to shouldRun always being false
            System.out.println("This is an unreachable else block in showBug()");
        }
    }

    public static void main(String[] args) {
        showBug();
    }

    private static boolean getCondition() {
        // This method always returns false, making the if-else blocks unreachable
        return false;
    }
}