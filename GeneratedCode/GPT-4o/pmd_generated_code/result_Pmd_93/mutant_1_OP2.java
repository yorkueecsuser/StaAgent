class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun
        
        // Mutation Operator: Duplication of the assignment statement
        Thread duplicatedT1 = t1;
        duplicatedT1.run(); // Duplicated line based on Duplication mutation operator

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}