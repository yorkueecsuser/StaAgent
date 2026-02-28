class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        // Added unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is an unreachable for loop");
        }
        return singleton;
    }

    public Singleton showBug() {
        Object obj = new Object();
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }

    private static boolean getCondition() {
        // This condition is always false to make the loop unreachable
        return false;
    }
}