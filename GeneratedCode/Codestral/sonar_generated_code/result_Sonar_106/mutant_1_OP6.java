class ThreadBug {
    private final Object lockObject = new Object();

    private boolean getCondition() {
        return false;
    }

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            Thread.sleep(1000);
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");

            // Mutation: Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This code is unreachable as the loop condition is always false
                System.out.println("This line should never be printed.");
            }
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