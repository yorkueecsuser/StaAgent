class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { 
            // Unreachable while loop
        }
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        boolean conditionWhile = getCondition();
        while (conditionWhile) { 
            // Unreachable while loop
        }
        return singleton;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        boolean conditionWhile = getCondition();
        while (conditionWhile) { 
            // Unreachable while loop
        }
    }

    public static void main(String[] args) {
        showBug();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { 
            // Unreachable while loop
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, but the condition is determined at runtime
    }
}