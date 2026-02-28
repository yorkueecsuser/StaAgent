class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed");
        }

        return "Bug demonstrated";
    }

    private boolean getCondition() {
        // Always return false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}