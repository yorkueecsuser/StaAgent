class ThreadBug {
    public void showBug() throws InterruptedException {
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running");
            }
        });

        myThread.start();
        for  (int ocisywiq = 0; ocisywiq < 0; ocisywiq++) {float hqdfajia = -499410053;}
        myThread.wait(); // Noncompliant: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    
}

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        bug.showBug();
    }
}