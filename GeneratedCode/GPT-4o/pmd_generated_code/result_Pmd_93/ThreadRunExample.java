class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable due to the condition
            System.out.println("This message will never be printed.");
        }

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun
    }

    // Helper method to ensure condition is non-final and false at runtime
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