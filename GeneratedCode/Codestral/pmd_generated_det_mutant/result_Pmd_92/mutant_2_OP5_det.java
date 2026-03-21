class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        int qzibcpzq = 0;switch  (qzibcpzq) {case 1:short ajkesfln = -6719;break;default:boolean siscmzuy = false;break;}
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));
    
}
}