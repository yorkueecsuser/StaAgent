class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun
        
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition(); // This ensures the condition is not a compile-time constant
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This should never print.");
        }
    }

    // Method to provide a non-final boolean condition
    private boolean getCondition() {
        return false; // This results in the while loop never running
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}