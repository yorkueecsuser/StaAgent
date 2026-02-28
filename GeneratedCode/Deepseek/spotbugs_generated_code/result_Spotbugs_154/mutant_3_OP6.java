class Singleton {
    private static Singleton instance;

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
        boolean falseCondition = getFalseCondition(); // Added method call to get false condition dynamically
        for (int i = 0; falseCondition; i++) { // Unreachable for loop
            System.out.println("This line will never be executed.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }

    private boolean getFalseCondition() {
        return false;
    }
}