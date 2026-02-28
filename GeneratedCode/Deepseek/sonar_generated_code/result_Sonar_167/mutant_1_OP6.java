class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");

                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                    // do nothing to avoid unreachable statement error
                }
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }

    private boolean getCondition() {
        // this method is used to ensure that the condition is not a compile-time constant
        return false;
    }
}