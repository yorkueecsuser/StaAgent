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

class Mutant_1 {
    private static NonThreadSafeSingleton instance_1;
    private static AtomicInteger counter_1 = new AtomicInteger(0);

    private Mutant_1() {}

    public static Mutant_1 getInstance_1() {
        if (instance_1 == null) {
            instance_1 = new Mutant_1();
        }
        return instance_1;
    }

    public void incrementCounter_1() {
        counter_1.incrementAndGet();
    }

    public int getCounter_1() {
        return counter_1.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Mutant_1 singleton_1 = Mutant_1.getInstance_1();
        singleton_1.incrementCounter_1();
        System.out.println("Counter: " + singleton_1.getCounter_1());

        Thread t1_1 = new Thread(() -> {
            Mutant_1.getInstance_1().incrementCounter_1();
        });

        Thread t2_1 = new Thread(() -> {
            Mutant_1.getInstance_1().incrementCounter_1();
        });

        t1_1.start();
        t2_1.start();
        t1_1.join();
        t2_1.join();

        System.out.println("Counter: " + singleton_1.getCounter_1());
    }
}