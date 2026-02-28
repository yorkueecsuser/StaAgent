import java.lang.String;

class Main {

    final String x = "Hello world!";
    final String b = "Hello world!";

    // BUG: Synchronization should not be done on instances of value-based classes
    public synchronized void syncMethod(String x) {
        synchronized (x) {
            if (x.equals(x)) {
                System.out.println("Inside 'x' block");
            }
        }
        synchronized (b) {
            if (b.equals(x)) {
                System.out.println("Inside 'b' block");
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