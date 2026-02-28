class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun

        // Inserting unreachable switch statement
        int unreachableVariable = getUnreachableValue();
        switch (unreachableVariable) {
            case 999: // This case will never be reached because unreachableVariable is set to a different value by getUnreachableValue()
                System.out.println("This should never be printed.");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case unreachable
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}