class Singleton {
    private static Singleton instance;

    // Non-private constructor // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showBug() {
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        System.out.println("Objects are equal: " + (obj1 == obj2));
    }

    // New method to demonstrate violating the singleton pattern using do-while loop
    public void createMultipleInstances() {
        Singleton[] objects = new Singleton[2];
        int i = 0;
        do {
            objects[i] = new Singleton();
            i++;
        } while (i < 2);
        System.out.println("Multiple instances created. Are they equal: " + (objects[0] == objects[1]));
    }
}