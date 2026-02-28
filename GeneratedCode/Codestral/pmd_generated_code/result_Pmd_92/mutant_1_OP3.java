class UsingExecutorService {

    public void showBug() {
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        // Mutation Operator: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should not be executed!");
        }

        executorService.submit(() -> System.out.println("Hello!"));
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}