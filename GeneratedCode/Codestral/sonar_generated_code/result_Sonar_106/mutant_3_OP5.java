class ThreadBug {
    private final Object lockObject = new Object();

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held

            // Mutant: Unreachable switch statement
            boolean shouldRun = getCondition();
            if (!shouldRun) {
                int value = 0;
                switch (value) {
                    case 1:
                        // This code is unreachable
                        System.out.println("Unreachable code executed.");
                        break;
                }
            }

            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    private boolean getCondition() {
        return false;
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