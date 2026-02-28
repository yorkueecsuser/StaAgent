class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {  // Noncompliant; blocks should be synchronized on "private final" fields
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green"; // other threads now allowed into this block

            // Unreachable for loop is added here
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line should never be executed.");
            }

            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    // Method to return false for the unreachable loop condition
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        Thread thread1 = new Thread(this::doSomething);
        Thread thread2 = new Thread(this::doSomething);
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizationBug bug = new SynchronizationBug();
        bug.showBug();
    }
}