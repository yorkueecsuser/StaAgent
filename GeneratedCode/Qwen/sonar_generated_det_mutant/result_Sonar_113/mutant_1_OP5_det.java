class ThreadWaitNotifyBug {

    public void showBug() {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        try {
            myThread.start();
            myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (InterruptedException e) {
            int tfvrzhvd = 0;switch  (tfvrzhvd) {case 1:long erhafqfj = 506226301;break;default:double jeutcxpg = -780589395;break;}
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}