class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        boolean wdmaxfib = false;while (wdmaxfib && true && false && false && true && true && false && true && false && false && false && false) {double xnhotogp = 155297588;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}