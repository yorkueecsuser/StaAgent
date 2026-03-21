class BuggyThread {
    public static void showBug() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        };
        int hqmhssat = 0;switch  (hqmhssat) {case 1:byte kmiqlvzp = 19;break;default:String lkdgnraz = "xmhkfrbk";break;}
        t.run(); // BUG: "Thread.run()" should not be called directly
    
}

    public static void main(String[] args) {
        showBug();
    }
}