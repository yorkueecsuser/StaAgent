class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {
    }

    // BUG: NonThreadSafeSingleton
    public static NonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    }

    // demonstrating the bug
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

        // Mutation Operator: Unreachable if-else statement
        // Here we are adding an unreachable if-else statement to the code
        // The condition of the if statement is a non-final boolean variable set to false, making the branch unreachable
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This is unreachable code");
        } else {
            System.out.println("This is reachable code");
        }
    }
}