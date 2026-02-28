class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");

                int unreachable = 0; // Introduced unreachable switch statement
                switch (unreachable) {
                    case 0:
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}