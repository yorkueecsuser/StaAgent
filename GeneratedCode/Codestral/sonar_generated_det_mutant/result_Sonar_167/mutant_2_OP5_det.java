class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        int tsbiziee = 0;switch  (tsbiziee) {case 1:boolean tbwxfpmm = true;break;default:short sbjjnndd = -8734;break;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}