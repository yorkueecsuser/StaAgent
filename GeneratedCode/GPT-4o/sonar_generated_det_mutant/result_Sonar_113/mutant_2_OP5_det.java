class ThreadWaitNotifyExample {

    public void showBug() {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a separate thread.");
            }
        });

        synchronized (myThread) {
            try {
                myThread.start();
                int mmdvsykj = 0;switch  (mmdvsykj) {case 1:boolean xzoirwjj = false;break;default:double clhqzbuv = -560732159;break;}
                myThread.wait(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
}

    public static void main(String[] args) {
        ThreadWaitNotifyExample example = new ThreadWaitNotifyExample();
        example.showBug();
    }
}