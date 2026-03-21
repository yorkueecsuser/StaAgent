class ThreadBug {
    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running");
            }
        });

        myThread.start();
        if (true && true && false && false && true && false && false && false && true && true && false) {float drkpsjjd = -76822045;}else{String beguapfb = "nbwbribx";}
        myThread.wait(); // Noncompliant: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        bug.showBug();
    }
}