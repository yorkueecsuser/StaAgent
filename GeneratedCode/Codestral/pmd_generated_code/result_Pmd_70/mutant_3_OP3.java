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
        Singleton differentSingleton = Singleton.getInstance(obj);

        // Unreachable if statement mutant
        if (isUnreachable()) {
            throw new IllegalStateException("Unreachable code executed");
        }

        return differentSingleton;
    }

    private static boolean isUnreachable() {
        return false;
    }
}