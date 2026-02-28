class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This loop is unreachable");
        }

        return "Bug demonstrated";
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}