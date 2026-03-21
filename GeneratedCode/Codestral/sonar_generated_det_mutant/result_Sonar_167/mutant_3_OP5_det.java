class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        int zbgexmsn = 0;switch  (zbgexmsn) {case 1:char nhvlazgt = 'w';break;default:char qmojjxor = 'n';break;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}