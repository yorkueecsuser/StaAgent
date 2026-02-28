class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            // Mutant: Unreachable while loop
            boolean unreachableCondition = false;
            while (unreachableCondition) {
                // This code will never be executed
                System.out.println("This is an unreachable while loop");
            }
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}