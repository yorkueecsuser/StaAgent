class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun

        // Inserting an unreachable if-else statement
        boolean isConditionMet = getCondition();
        if (isConditionMet) {
            System.out.println("This part of the code will not run due to condition.");
        } else {
            System.out.println("This part will always execute.");
        }
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }

    private boolean getCondition() {
        return false; // This method is used to ensure the condition is not a compile-time constant
    }
}