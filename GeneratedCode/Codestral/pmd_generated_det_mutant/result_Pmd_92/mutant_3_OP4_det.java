class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        if (true && false && false && false && true && false && true && true && false && true && false) {double ipamwohh = 301522716;}else{long ziqnaodg = -284916630;}
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));
    
}
}