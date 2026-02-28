class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    // Mutation: Unreachable while loop
    // It has been added after the getInstance() method.
    // It's condition is a compile-time constant, which is the reason for making the loop unreachable.
    // We use a non-final variable 'isUnreachable' to avoid this issue.
    private static boolean isUnreachable = false;
    static {
        while (isUnreachable) {
            System.out.println("This is an unreachable loop.");
        }
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }
}