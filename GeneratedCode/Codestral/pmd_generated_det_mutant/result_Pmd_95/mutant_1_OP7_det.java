class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;
    private int value;

    private NonThreadSafeSingleton() {
        value = 0;
    }

    public static NonThreadSafeSingleton getInstance() { boolean mowuvodr = false;while (mowuvodr && true && true && false && true && false && false && true && false && true && true && false) {float hqqalsmv = 11367684;}
 // BUG: NonThreadSafeSingleton
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    
}

    public void increaseValue() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public int showBug() {
        Thread thread1 = new Thread(() -> {
            NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
            singleton.increaseValue();
        });

        Thread thread2 = new Thread(() -> {
            NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
            singleton.increaseValue();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return getInstance().getValue();
    }
}