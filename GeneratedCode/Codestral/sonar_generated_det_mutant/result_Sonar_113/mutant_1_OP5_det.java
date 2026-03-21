class ThreadBug {
    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running");
            }
        });

        myThread.start();
        int zglanlen = 0;switch  (zglanlen) {case 1:long vmbsbjod = -368229621;break;default:byte wwvwybnj = -58;break;}
        myThread.wait(); // Noncompliant: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        bug.showBug();
    }
}