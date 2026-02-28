class Singleton {

    private static Singleton singleton = new Singleton( );

    private Singleton(){ }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public static Singleton getInstance(Object obj){
        Singleton singleton = (Singleton) obj;
        return singleton;           // BUG: SingleMethodSingleton
    }

    public void showBug() {
        Object obj = new Object();
        Singleton instance = getInstance(obj);
    }

    // Mutation code begins here:
    private boolean getCondition() {
        return false;
    }

    public void unreachableIfStatement() {
        if (getCondition()) {
            // Unreachable code
            System.out.println("This will never be executed");
        }
    }
}