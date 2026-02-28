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

        // Added unreachable switch statement
        boolean condition = shouldRunSwitch();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line should never be executed");
                    break;
            }
        }

        return differentSingleton;
    }

    // Method to determine if switch should run
    private static boolean shouldRunSwitch() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}