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

    public void unreachableSwitchStatementMutant() {
        boolean unreachableCondition = false;

        switch(1) {
            default: 
                unreachableCondition = true; 
                break;
        }

        if (unreachableCondition) {
            // This code should never be reached
            System.out.println("This is an unreachable statement");
        }
    }
}