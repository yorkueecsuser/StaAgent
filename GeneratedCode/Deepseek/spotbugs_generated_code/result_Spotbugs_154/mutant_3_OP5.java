// Java code with the Singleton design pattern having a non-private constructor
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
        System.out.println("Objects are equal: " + (obj1 == obj2));

        // Adding unreachable switch statement
        boolean switchCondition = false;
        if (switchCondition) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable code executed.");
                    break;
                default:
                    System.out.println("Default case of unreachable switch statement executed.");
            }
        }
    }

    private int getValue() {
        // Method to simulate dynamic value
        return 0;
    }
}