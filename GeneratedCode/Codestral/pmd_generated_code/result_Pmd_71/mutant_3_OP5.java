class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor to restrict new instances
    }

    public static Singleton getInstance() {
        synchronized(Singleton.class) {
            int value = getValue(); // Method call to determine value at runtime
            switch (value) {
                case 1:
                    // This case will never be reached because getValue() always returns 0
                    throw new IllegalStateException("Unreachable switch case");
            }
            return new Singleton(); // Bug: SingletonClassReturningNewInstance
        }
    }

    public static int getValue() {
        return 0; // Always returns 0, making the switch case unreachable
    }

    public static void showBug() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Are instances equal? " + (instance1 == instance2));
    }
}