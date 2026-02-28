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

    public void mutator() {
        boolean condition = false;
        if (condition) {
            // Unreachable code
            System.out.println("This line of code will never be executed");
        } else {
            // This is the mutated code that will be executed if the original code is unreachable
            System.out.println("This line of code will always be executed");
        }
    }
}