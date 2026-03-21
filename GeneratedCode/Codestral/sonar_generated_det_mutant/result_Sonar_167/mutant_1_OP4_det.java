class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        if (true && true && true && false && false && false && true && true && true && false && false) {char npxvburw = 'k';}else{short kzjxqopq = -9145;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}