class BuggyThread {

    public void showBug() {
        new Thread() {
            public void renamedRun() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.renamedRun();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}