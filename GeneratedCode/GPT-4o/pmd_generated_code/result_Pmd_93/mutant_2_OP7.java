class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This line will never be printed.");
        }
    }

    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}