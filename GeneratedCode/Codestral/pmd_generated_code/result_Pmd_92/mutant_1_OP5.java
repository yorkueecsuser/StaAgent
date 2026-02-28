class UsingExecutorService {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            if (getFalseCondition()) {
                int value = 0;
                switch(value) {
                    case 1:
                        System.out.println("This should not be printed.");
                        break;
                }
            }
            System.out.println("Hello!");
        });
    }
}