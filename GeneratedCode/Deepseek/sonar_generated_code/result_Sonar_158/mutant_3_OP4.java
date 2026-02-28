import java.lang.String;

class Main {

    final String a = "Hello world!";
    final String b = "Hello world!";

    // BUG: Synchronization should not be done on instances of value-based classes
    public synchronized void syncMethod(String x) {
        synchronized (a) {
            if (a.equals(x)) {
                System.out.println("Inside 'a' block");
            }
        }
        synchronized (b) {
            if (b.equals(x)) {
                System.out.println("Inside 'b' block");
            }
        }

        // Unreachable if-else statement
        if (false) { // Non-reachable if-else statement condition
            System.out.println("This line will never be executed"); // Unreachable code
        } else {
            System.out.println("This line will always be executed"); // Reachable code
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