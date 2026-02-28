class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun
        
        // Mutation: Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableValue();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case will never be hit.");
                break;
            case 2:
                System.out.println("Neither will this one.");
                break;
            default:
                // This default case is left empty on purpose
        }
    }

    private int getUnreachableValue() {
        // Simulating a condition that always evaluates to a value not in our switch cases
        return 3;
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}