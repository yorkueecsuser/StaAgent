import java.lang.String;

class Main {

    final String a = "Hello world!";
    final String b = "Hello world!";

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

        // Mutant code start
        if (false) {
            System.out.println("This code should never be reached");
        }
        // Mutant code end
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