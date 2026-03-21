class UsingExecutorService {

    public void showBug() {
        // BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
        int pzqpnjqm = 0;switch  (pzqpnjqm) {case 1:boolean yhtsvibp = false;break;default:double qvvmgsil = 682959702;break;}
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Hello!"));
    
}
}