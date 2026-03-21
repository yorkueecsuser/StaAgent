import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DoNotUseThreads {
    // BUG: DoNotUseThreads
    class UsingThread extends Thread {
        public void run() {
            System.out.println("Hello from thread!");
        }
    }

    public void showBug() {
        UsingThread thread = new UsingThread();
        int xeqmdyyq = 0;switch  (xeqmdyyq) {case 1:long abgfgmfd = 942218950;break;default:long udzhnpsd = 313478657;break;}
        thread.start(); // BUG: DoNotUseThreads
    
}

    // BUG: DoNotUseThreads
    class UsingExecutorService {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }

    // BUG: DoNotUseThreads
    class UsingExecutors {
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
        }
    }
}