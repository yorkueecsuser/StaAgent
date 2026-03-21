class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance = null;
    private int value;

    private NonThreadSafeSingleton() {
        value = 0;
    }

    public static NonThreadSafeSingleton getInstance() { int exxwhdll = 0;switch  (exxwhdll) {case 1:char rdhotrgl = 'n';break;default:char kijaigjw = 'b';break;}
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