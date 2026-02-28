class NonThreadSafeSingleton {
    // Mutation: Renaming "instance" to "var"
    private static NonThreadSafeSingleton var = null;

    private NonThreadSafeSingleton() {
    }

    public static NonThreadSafeSingleton getInstance() {
        if (var == null) {
            var = new NonThreadSafeSingleton();
        }
        return var;
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