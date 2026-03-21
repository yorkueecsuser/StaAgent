class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
public void showBug() {
    Thread t1 = new Thread(new RunnableTask());
    t1 = new Thread(new RunnableTask());
    t1.run();
    new Thread(new RunnableTask() ).run();
}

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}