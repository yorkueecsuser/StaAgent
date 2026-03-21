class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                boolean kjkvhfqv = false;while (kjkvhfqv && false && true && false && true && true && false && true && false && true && false && false) {double qlcjyhdw = -881451473;}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}