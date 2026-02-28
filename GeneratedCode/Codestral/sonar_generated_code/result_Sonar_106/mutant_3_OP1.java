import java.util.Random;

class ThreadBug {
    private final Object lockObject = new Object();
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final int VAR_NAME_LENGTH = 8;

    public void showBug() throws InterruptedException {
        String deadStore = generateRandomString(); // Dead Store
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            lockObject.wait(1000); // Mutated code: "wait(...)" is used instead of "Thread.sleep(...)"
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();

        Thread thread1 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }

    private static String generateRandomString() {
        StringBuilder sb = new StringBuilder(VAR_NAME_LENGTH);
        Random random = new Random();
        for (int i = 0; i < VAR_NAME_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}