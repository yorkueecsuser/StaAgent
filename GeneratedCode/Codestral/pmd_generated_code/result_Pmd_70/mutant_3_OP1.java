class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        int deadStoreVariable = 10; // Mutation Operator: Dead Store - Adding a dead store variable
        return singleton;
    }

    public Singleton showBug() {
        Object obj = new Object();
        int anotherDeadStoreVariable = 20; // Mutation Operator: Dead Store - Adding another dead store variable
        Singleton differentSingleton = Singleton.getInstance(obj);
        return differentSingleton;
    }
}