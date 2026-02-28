class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because conditionWhile is always false
        }
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because conditionWhile is always false
        }
        return singleton;
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance(new Singleton());
        
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because conditionWhile is always false
        }
    }

    public static void main(String[] args) {
        showBug();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because conditionWhile is always false
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, making the while loop unreachable
    }
}