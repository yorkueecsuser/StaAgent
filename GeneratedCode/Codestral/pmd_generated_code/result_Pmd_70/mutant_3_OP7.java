class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;
    }

    public Singleton showBug() {
        Object obj = new Object();
        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }

    // Dummy method to provide a non-final variable for the while loop condition
    private boolean getCondition() {
        return false;
    }
}