class ThreadRunBugExample {

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        String result = example.showBug();
        System.out.println(result);
    }
public String showBug() {
    MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable);
    thread = new Thread(myRunnable);
    thread.run();
    return myRunnable.getMessage();
}

    class MyRunnable implements Runnable {
        private String message = "No execution";

        @Override
        public void run() {
            message = "Running in a new thread!";
        }

        public String getMessage() {
            return message;
        }
    }
}