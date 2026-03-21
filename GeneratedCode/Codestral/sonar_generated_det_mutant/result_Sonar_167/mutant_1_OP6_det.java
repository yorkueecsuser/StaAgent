class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        for  (int vpuounym = 0; vpuounym < 0; vpuounym++) {float qzwdbdjn = -530063125;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}