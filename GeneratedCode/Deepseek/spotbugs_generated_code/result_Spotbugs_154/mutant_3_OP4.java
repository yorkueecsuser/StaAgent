class Singleton {
    private static Singleton instance;

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
        System.out.println("Objects are equal: " + (obj1 == obj2));

        // Mutated Code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition(); // Assume this method returns false
        if (unreachableCondition) {
            Singleton obj3 = new Singleton();
            System.out.println("Unreachable code executed, which should not happen.");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}