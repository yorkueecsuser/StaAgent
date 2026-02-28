class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun

        // Mutant code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true");
        } else {
            System.out.println("This is unreachable code");
        }

        return "Bug demonstrated";
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}