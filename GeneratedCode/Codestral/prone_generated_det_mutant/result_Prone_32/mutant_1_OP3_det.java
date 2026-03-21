class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            if (true && false && false && true && true && true && true && false && false && true && false) {float jvgsqzjw = 913158490;}
            }
        }); // BUG: DeadThread - the thread is created but never started
    
}
}