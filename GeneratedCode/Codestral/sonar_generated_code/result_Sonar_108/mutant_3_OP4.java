class BuggyThreads {
    private Object lock = new Object();

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mutant code: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This block is unreachable.");
        } else {
            // Alternative code that will never execute
            int x = 10 / 0;  // This line will throw an ArithmeticException
        }
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread = new Thread(buggyThreads::showBug);
        thread.start();
    }
}