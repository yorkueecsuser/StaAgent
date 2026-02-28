import java.util.Random;

class MutableServletBug {
    private int counter = 0;
    private Random random = new Random(); // Added for dead store mutant

    private void incrementCounter() {
        counter++;
        int deadStoreVariable = random.nextInt(); // Dead store mutant
    }

    public void showBug() {
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

        System.out.println("Counter after two increments: " + counter);
    }
}