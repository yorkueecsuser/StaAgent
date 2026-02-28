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

        // Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This case is unreachable
                break;
        }

        return differentSingleton;
    }

    private static int getUnreachableValue() {
        // This method always returns a value that is not 1
        return 0;
    }
}