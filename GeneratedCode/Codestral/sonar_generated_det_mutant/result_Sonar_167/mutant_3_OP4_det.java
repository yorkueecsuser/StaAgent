class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        if (false && true && false && true && false && true && false && false && false && false && false) {float cpiaiebd = -999306928;}else{double ylmhzpiz = -122543670;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}