class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.run();
        
        // Mutated Code
        int value = 0;
        switch (value) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default code");
                break;
        }
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}