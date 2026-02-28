import java.lang.String;

class Main {

    final String c = "Hello world!";
    final String d = "Hello world!";

    // BUG: Synchronization should not be done on instances of value-based classes
    public synchronized void syncMethod(String x) {
        synchronized (c) {
            if (c.equals(x)) {
                System.out.println("Inside 'c' block");
            }
        }
        synchronized (d) {
            if (d.equals(x)) {
                System.out.println("Inside 'd' block");
            }
        }
    }

    public void showBug() {
        Thread t1 = new Thread(() -> syncMethod("Hello world!"));
        Thread t2 = new Thread(() -> syncMethod("Hello world!"));
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}