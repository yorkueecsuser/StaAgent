import java.util.concurrent.atomic.AtomicInteger;

class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton instance;
    private static AtomicInteger counter = new AtomicInteger(0);

    private NonThreadSafeSingleton() {}

    public static NonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NonThreadSafeSingleton();
        }
        return instance;
    }

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
        singleton.incrementCounter();
        System.out.println("Counter: " + singleton.getCounter());

        Thread t1 = new Thread(() -> {
            NonThreadSafeSingleton.getInstance().incrementCounter();
        });

        Thread t2 = new Thread(() -> {
            NonThreadSafeSingleton.getInstance().incrementCounter();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + singleton.getCounter());
    }
}

// Unreachable if statement mutant
class NonThreadSafeSingletonMutant {
    private static NonThreadSafeSingletonMutant instance;
    private static AtomicInteger counter = new AtomicInteger(0);

    private NonThreadSafeSingletonMutant() {}

    public static NonThreadSafeSingletonMutant getInstance() {
        if (instance == null) {
            instance = new NonThreadSafeSingletonMutant();
        }
        return instance;
    }

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        NonThreadSafeSingletonMutant singleton = NonThreadSafeSingletonMutant.getInstance();
        singleton.incrementCounter();
        System.out.println("Counter: " + singleton.getCounter());

        Thread t1 = new Thread(() -> {
            NonThreadSafeSingletonMutant.getInstance().incrementCounter();
        });

        Thread t2 = new Thread(() -> {
            NonThreadSafeSingletonMutant.getInstance().incrementCounter();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + singleton.getCounter());
    }
}