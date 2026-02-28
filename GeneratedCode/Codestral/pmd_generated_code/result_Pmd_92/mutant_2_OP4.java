class UsingExecutorService {

    private boolean getUnreachableCondition() {
        // This method will always return false, making the if-else branch unreachable
        return false;
    }

    public void showBug() {
        // Original code
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));

        // Mutated code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable branch!");
        } else {
            // This code will never execute, but it's necessary for the program to compile
            System.out.println("This else branch is also unreachable, but it's here to avoid compile errors.");
        }
    }
}