class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            boolean condition = getCondition();  // added dynamically determined condition
            if (condition) {  // added unreachable if statement
                System.out.println("Unreachable code");
            }
            return new Singleton();  // Bug: SingletonClassReturningNewInstance
        }
    }

    private static boolean getCondition() {
        return false;  // always false to make it unreachable
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}