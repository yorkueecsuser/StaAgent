class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun

        // Introduced unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
    }

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