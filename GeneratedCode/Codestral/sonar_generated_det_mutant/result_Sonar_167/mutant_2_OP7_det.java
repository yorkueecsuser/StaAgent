class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        boolean ehgjisnu = false;while (ehgjisnu && false && true && false && true && false && false && true && true && true && true && false) {short plzdveqo = -6443;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}