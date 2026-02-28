class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    }

    private static boolean getCondition() {
        return false;
    }

    public Singleton showBug() {
        Object obj = new Object();
        Singleton differentSingleton = Singleton.getInstance(obj);

        if (getCondition()) {
            // This code block is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This code block is always executed
            System.out.println("This line is always executed.");
        }

        return differentSingleton;
    }
}