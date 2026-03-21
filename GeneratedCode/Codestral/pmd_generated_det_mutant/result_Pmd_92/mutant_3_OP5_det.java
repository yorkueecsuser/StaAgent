class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        int xxfpeojy = 0;switch  (xxfpeojy) {case 1:long epjpnelv = -856475332;break;default:String gdboamwo = "xmbimvrv";break;}
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));
    
}
}