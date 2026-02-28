class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {
    }

    // Mutants:
    // Original code:
    // public static NonThreadSafeSingleton getInstance() {
    //     if (instance == null) {
    //         instance = new NonThreadSafeSingleton();
    //     }
    //     return instance;
    // }

    // Mutant 1:
    // Unreachable if statement:
    // public static NonThreadSafeSingleton getInstance() {
    //     if (instance == null) {
    //         instance = new NonThreadSafeSingleton();
    //     }
    //     if (false) {
    //         System.out.println("This will never be executed");
    //     }
    //     return instance;
    // }

    // Mutant 2:
    // Unreachable if statement:
    // public static NonThreadSafeSingleton getInstance() {
    //     if (false) {
    //         System.out.println("This will never be executed");
    //     }
    //     else if (instance == null) {
    //         instance = new NonThreadSafeSingleton();
    //     }
    //     return instance;
    // }

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
    }
}