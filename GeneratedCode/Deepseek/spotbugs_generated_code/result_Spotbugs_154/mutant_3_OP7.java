class Singleton {
    private static Singleton instance;

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
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

        // Mutant code // BUG: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition(); // replace this method with a method that returns false
        while (conditionWhile) {
            System.out.println("This line should not be executed");
        }

        System.out.println("Objects are equal: " + (obj1 == obj2));
    }

    private boolean getUnreachableCondition() {
        return false; // This method should return false to make the while loop unreachable
    }
}