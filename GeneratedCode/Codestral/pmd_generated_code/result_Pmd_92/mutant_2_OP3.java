class UsingExecutorService {

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        if (getCondition()) {
            System.out.println("This is an unreachable if statement");
        }

        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));
    }
}