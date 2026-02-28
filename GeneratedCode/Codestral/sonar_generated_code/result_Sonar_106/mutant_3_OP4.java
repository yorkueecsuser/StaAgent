class ThreadBug {
    private final Object lockObject = new Object();

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the branch unreachable
    }

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");

            if (getUnreachableCondition()) {
                // Unreachable if-else statement
                System.out.println("This line is unreachable.");
            } else {
                Thread.sleep(1000);
            }

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
}