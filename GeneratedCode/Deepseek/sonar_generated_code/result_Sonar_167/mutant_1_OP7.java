class BuggyThread {

    private boolean condition = false; // Mutation to make while loop unreachable

    public void showBug() {
        new Thread() {
            public void run() {
                System.out.println("This is executed in a new thread");
            }
        }.run();

        while(condition) { // added unreachable while loop
            if(condition) {
                System.out.println("This is an unreachable code due to the added mutation");
            }
        }
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}