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

    // Unreachable for loop mutant
    public void unreachableForLoopMutant() {
        boolean unreachableForCondition = getCondition();
        for (int i = 0; i < 10; i++) {
            if(unreachableForCondition == false) {
                continue;
            }
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}