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
class UnreachableIfStatementMutant extends NonThreadSafeSingleton {
    private static boolean condition = true;

    @Override
    public void incrementCounter() {
        if (condition) {
            counter.incrementAndGet();
        }
    }

    @Override
    public int getCounter() {
        if (condition) {
            return counter.get();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UnreachableIfStatementMutant singleton = UnreachableIfStatementMutant.getInstance();
        singleton.incrementCounter();
        System.out.println("Counter: " + singleton.getCounter());

        Thread t1 = new Thread(() -> {
            UnreachableIfStatementMutant.getInstance().incrementCounter();
        });

        Thread t2 = new Thread(() -> {
            UnreachableIfStatementMutant.getInstance().incrementCounter();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + singleton.getCounter());
    }
}