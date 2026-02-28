class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    private static boolean isUnreachableCondition() {
        return false;
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            if (isUnreachableCondition()) {
                // Unreachable code
                Singleton unreachableInstance = new Singleton();
                return unreachableInstance;
            } else {
                return new Singleton(); // Bug: SingletonClassReturningNewInstance
            }
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}