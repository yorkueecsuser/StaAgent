class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;
    private static boolean singletonLock = true;

    private NonThreadSafeSingleton() {
    }

    public static NonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    }

    public static void showBug() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }
        });

        t1.start();
        t2.start();

        // Mutation Operator: Unreachable switch statement
        while (singletonLock) {
            int randomValue = 0;
            switch (randomValue) {
                case 0: 
                    break;
                default:
                    break;
            }
        }
    }
}