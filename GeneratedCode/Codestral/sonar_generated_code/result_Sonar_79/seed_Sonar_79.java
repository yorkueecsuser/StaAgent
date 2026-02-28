import java.util.concurrent.atomic.AtomicInteger;

class VolatileCompoundBug {
    private volatile int count = 0; // Noncompliant: volatile variable used with compound operator
    private volatile boolean boo = false; // Noncompliant: volatile variable used with compound operator

    public void incrementCount() {
        count++; // Bug: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo(){
        boo =!boo; // Bug: "volatile" variables should not be used with compound operators
    }

    public void showBug() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCount();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCount();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Expected count: 20000, Actual count: " + count);
    }

    public static void main(String[] args) {
        VolatileCompoundBug bug = new VolatileCompoundBug();
        bug.showBug();
    }
}