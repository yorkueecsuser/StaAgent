class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will also never be printed");
        }

        return "Bug demonstrated";
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}