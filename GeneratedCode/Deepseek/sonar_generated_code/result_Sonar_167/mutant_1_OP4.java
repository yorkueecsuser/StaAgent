class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.run();
    }

    public void showMutant() {
        boolean shouldExecute = true;
        if (shouldExecute) {
            new Thread() {
                public void run() {
                    // Mutated BUG: "Thread.run()" should not be called directly
                    System.out.println("This is executed in a new thread");
                }
            }.run();
        } else {
            System.out.println("This should not be executed");
        }
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
        new BuggyThread().showMutant();
    }
}