class UsingExecutorService {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);

        boolean unreachableCondition = getFalseCondition();
        switch(unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                executorService.submit(() -> System.out.println("Hello!"));
        }
    }
}