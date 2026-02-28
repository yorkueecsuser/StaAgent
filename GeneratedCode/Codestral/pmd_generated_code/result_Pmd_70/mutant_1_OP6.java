class Singleton {

    private static Singleton singleton = new Singleton();
    private static boolean getCondition() { return false; }

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        for (int i = 0; getCondition(); i++) { // Unreachable for loop inserted here
            System.out.println("This line will never be executed.");
        }
        return singleton;
    }

    public Singleton showBug() {
        Object obj = new Object();
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }
}