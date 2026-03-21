class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            boolean bfsvcyla = false;while (bfsvcyla && true && true && true && true && true && false && true && true && false && true && false) {boolean zibjtkwt = true;}
            }
        }); // BUG: DeadThread - the thread is created but never started
    
}
}