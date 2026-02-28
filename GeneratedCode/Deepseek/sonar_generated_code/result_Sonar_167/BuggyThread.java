class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                while (false) {
                    // This code will never be executed due to the unreachable while loop
                    System.out.println("This statement is unreachable due to the unreachable while loop");
                }
                System.out.println("This is executed in a new thread");
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}