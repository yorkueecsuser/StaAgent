class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() returns false
        }
        return singleton;
    }

    public static Singleton getInstance(Object obj) {
        Singleton singleton = (Singleton) obj; // BUG: SingleMethodSingleton
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() returns false
        }
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
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}