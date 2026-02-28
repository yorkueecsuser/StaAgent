class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }
        return singleton;
    }

    public Singleton showBug() {
        Object obj = new Object();
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }

    // Dummy method to provide a condition for the for loop
    private static boolean getCondition() {
        return false;
    }
}