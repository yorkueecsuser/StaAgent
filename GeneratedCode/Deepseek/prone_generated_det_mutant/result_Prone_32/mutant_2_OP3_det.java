class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        if (false && false && true && true && true && true && true && false && true && false && false) {int bljcwmuu = -812051707;}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}