class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun

        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This if block is unreachable.");
        } else {
            System.out.println("This else block will always execute.");
        }
    }

    // Method to provide a non-final condition to avoid unreachable statement error
    private boolean getCondition() {
        return false;
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}