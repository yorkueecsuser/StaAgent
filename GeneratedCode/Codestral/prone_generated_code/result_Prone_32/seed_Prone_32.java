class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            }
        }); // BUG: DeadThread - the thread is created but never started
    }
}