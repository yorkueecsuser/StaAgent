import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafetyExample {
    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int showBug() {
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter.get();
    }

    public void addUnreachableSwitch() {
        int value = 0;
        switch (value) {
            default: 
                System.out.println("This is an unreachable switch");
                break;
        }
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();
        System.out.println(example.showBug());
        example.addUnreachableSwitch();
    }
}