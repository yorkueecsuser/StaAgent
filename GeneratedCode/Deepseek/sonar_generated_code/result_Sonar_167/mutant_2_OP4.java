class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
                if (false) {
                    // This branch is unreachable
                    System.out.println("This branch is unreachable");
                }
            }
        }.start();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}