class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        if (getUnreachableCondition()) { // Added unreachable if statement
            throw new RuntimeException("Unreachable code executed");
        }
        return singleton;
    }

    private static boolean getUnreachableCondition() {
        return false;
    }

    public Singleton showBug() {
        Object obj = new Object();
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }
}