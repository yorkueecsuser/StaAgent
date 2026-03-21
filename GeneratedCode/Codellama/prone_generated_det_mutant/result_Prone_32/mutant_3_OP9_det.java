import java.util.ArrayList;

class DeadThread {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        { int i = 0; do { Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // BUG: DeadThread
                    System.out.println("This thread is never started");
                }
            });
            threads.add(thread); i++; } while (i < 10); }
    }

    public static void showBug() {
        main(null);
    }
}