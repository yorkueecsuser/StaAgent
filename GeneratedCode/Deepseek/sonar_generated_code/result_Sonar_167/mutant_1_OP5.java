class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.run();
        int value = 0;  // Non-final variable for switch statement
        switch(value) {  // Switch statement with non-final variable as condition
            case 1:
                System.out.println("Unreachable switch statement");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}