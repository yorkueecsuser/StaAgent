class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        boolean vwvsqizf = false;while (vwvsqizf && false && false && false && true && true && false && true && true && false && false && false) {int oafusfql = -439835032;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}