class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}

// Mutated code with variable renaming
class ThreadRunExampleMutant {

    public static void main(String[] args) {
        ThreadRunExampleMutant example = new ThreadRunExampleMutant();
        example.showBug();
    }

    public void showBug() {
        Thread x = new Thread(new RunnableTaskRenamed());
        x.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTaskRenamed()).run(); // BUG: DontCallThreadRun
    }

    class RunnableTaskRenamed implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}