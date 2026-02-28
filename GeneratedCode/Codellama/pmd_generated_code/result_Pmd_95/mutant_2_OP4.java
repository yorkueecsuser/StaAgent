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

/*
Unreachable if-else statement mutation operator.

1. Insert unreachable if-else branch into a randomly selected basic block in the program.
2. The condition of the inserted branch is always false to make it unreachable.
3. Ensure that the original code is left in place and the mutated code compiles successfully.
4. Avoid unreachable statement errors by following the guidelines.
*/

class UnreachableIfElseSingleton {
    private static UnreachableIfElseSingleton instance;
    private static AtomicInteger counter = new AtomicInteger(0);

    private UnreachableIfElseSingleton() {}

    public static UnreachableIfElseSingleton getInstance() {
        if (instance == null) {
            instance = new UnreachableIfElseSingleton();
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
        UnreachableIfElseSingleton singleton = UnreachableIfElseSingleton.getInstance();
        singleton.incrementCounter();
        System.out.println("Counter: " + singleton.getCounter());

        Thread t1 = new Thread(() -> {
            UnreachableIfElseSingleton.getInstance().incrementCounter();
        });

        Thread t2 = new Thread(() -> {
            UnreachableIfElseSingleton.getInstance().incrementCounter();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + singleton.getCounter());
    }
}