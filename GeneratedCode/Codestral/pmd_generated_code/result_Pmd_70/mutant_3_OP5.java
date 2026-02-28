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
        boolean condition = false;
        int value = 1;
        if (condition) {
            switch(value) {
                case 1:
                    System.out.println("This line should never execute");
                    break;
            }
        }

        return differentSingleton;
    }
}