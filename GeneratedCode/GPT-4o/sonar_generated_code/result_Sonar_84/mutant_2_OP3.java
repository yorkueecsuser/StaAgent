class MultipleLocksWaitBug {

    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() {
        boolean condition = getCondition(); // Define a non-final variable to use for the unreachable if statement

        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (mon2) {
                    if (condition) {  // Unreachable if statement using a dynamically determined condition
                        System.out.println("This code is unreachable.");
                    }
                    try {
                        System.out.println("Thread A is waiting...");
                        mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon1) {
                if (condition) {  // Another unreachable if statement
                    System.out.println("This code is also unreachable.");
                }
                System.out.println("Thread B acquired lock on mon1.");
                // This thread cannot proceed to lock mon2 because threadA is holding it
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private boolean getCondition() {
        return false;  // Always returns false, making if statements' code unreachable
    }

    public static void main(String[] args) {
        MultipleLocksWaitBug bugDemo = new MultipleLocksWaitBug();
        bugDemo.showBug();
    }
}