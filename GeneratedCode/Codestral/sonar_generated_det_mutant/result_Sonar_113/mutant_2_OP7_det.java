class ThreadBug {
    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running");
            }
        });

        myThread.start();
        boolean yheajtaj = false;while (yheajtaj && false && false && true && true && true && false && true && true && false && false && false) {long gxemjzxp = 5656116;}
        myThread.wait(); // Noncompliant: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        bug.showBug();
    }
}