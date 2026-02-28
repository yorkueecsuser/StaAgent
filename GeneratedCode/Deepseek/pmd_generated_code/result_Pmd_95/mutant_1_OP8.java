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
    }
}

class MutantNonThreadSafeSingleton {
    private static MutantNonThreadSafeSingleton mutantInstance = null; // Variable renamed

    private MutantNonThreadSafeSingleton() {
    }

    // BUG: NonThreadSafeSingleton
    public static MutantNonThreadSafeSingleton getMutantInstance() { // Method renamed
        if (mutantInstance == null) {
            mutantInstance = new MutantNonThreadSafeSingleton();
        }
        return mutantInstance;
    }

    // demonstrating the bug
    public static void showBug() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                MutantNonThreadSafeSingleton mutantSingleton = MutantNonThreadSafeSingleton.getMutantInstance(); // Object renamed
                System.out.println(System.identityHashCode(mutantSingleton));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                MutantNonThreadSafeSingleton mutantSingleton = MutantNonThreadSafeSingleton.getMutantInstance(); // Object renamed
                System.out.println(System.identityHashCode(mutantSingleton));
            }
        });

        t1.start();
        t2.start();
    }
}