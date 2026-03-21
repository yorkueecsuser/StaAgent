class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                if (true && true && true && true && false && true && false && false && false && false && false) {char ojhelzvj = 'e';}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}