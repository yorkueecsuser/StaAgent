import java.lang.String;

class Main {

    final String a = "Hello world!";
    final String b = "Hello world!";

    public synchronized void syncMethod(String x) {
        synchronized (a) {
            // Mutation: Changing the condition from 'a.equals(x)' to 'a.equals(x) || false'
            if (a.equals(x) || false) {
                System.out.println("Inside 'a' block");
            }
        }
        synchronized (b) {
            // Mutation: Changing the condition from 'b.equals(x)' to 'b.equals(x) || false'
            if (b.equals(x) || false) {
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