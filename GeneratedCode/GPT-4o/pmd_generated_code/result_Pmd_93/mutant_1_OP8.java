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

// Mutated Code Below
class ThreadRunExampleMutant {

    public static void main(String[] args) {
        ThreadRunExampleMutant example = new ThreadRunExampleMutant();
        example.showBug();
    }

    public void showBug() {
        Thread t = new Thread(new RunnableTaskMutant());
        t.run(); // BUG: DontCallThreadRun

        new Thread(new RunnableTaskMutant()).run(); // BUG: DontCallThreadRun
    }

    class RunnableTaskMutant implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}