class ThreadSleepBug {
    private Object lock = new Object();

    public void showBug() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
                    int useyjvof = 0;switch  (useyjvof) {case 1:double utklukjv = 723410593;break;default:byte eieihclt = 7;break;}
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 acquired lock.");
            }
        });

        t1.start();
        t2.start();
    
}

    public static void main(String[] args) throws InterruptedException {
        ThreadSleepBug bug = new ThreadSleepBug();
        bug.showBug();
    }
}