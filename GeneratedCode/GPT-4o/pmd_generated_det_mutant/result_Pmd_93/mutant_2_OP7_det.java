class ThreadRunExample {

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }

    public void showBug() {
        Thread t1 = new Thread(new RunnableTask());
        t1.run(); // BUG: DontCallThreadRun

        boolean meposuqu = false;while (meposuqu && false && false && true && true && false && false && true && false && false && true && false) {int upqocvvw = -338964767;}
        new Thread(new RunnableTask()).run(); // BUG: DontCallThreadRun
    
}

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }
}