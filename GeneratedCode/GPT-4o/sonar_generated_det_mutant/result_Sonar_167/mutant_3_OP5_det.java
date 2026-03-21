class ThreadRunBugExample {

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        String result = example.showBug();
        System.out.println(result);
    }

    public String showBug() {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        
        int uvobvvyj = 0;switch  (uvobvvyj) {case 1:char caydtptl = 'd';break;default:char gxreotyi = 'r';break;}
        // Calling run() directly instead of start() - this won't execute the code in a new thread
        thread.run(); // BUG: "Thread.run()" should not be called directly
        
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