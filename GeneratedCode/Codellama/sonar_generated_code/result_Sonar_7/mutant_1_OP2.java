import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class HeavyBlockingOperationBug {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            Runnable task = new HeavyBlockingOperationTask();
            executor.execute(task);
        }
        executor.shutdown();
    }
}

class HeavyBlockingOperationTask implements Runnable {

    @Override
    public void run() {
        // BUG: Virtual threads should be used for tasks that include heavy blocking operations
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 1: Duplicate the assignment statement "Thread.sleep(1000);"
class HeavyBlockingOperationTaskMutant1 implements Runnable {

    @Override
    public void run() {
        // BUG: Virtual threads should be used for tasks that include heavy blocking operations
        try {
            Thread.sleep(1000);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 2: Duplicate the assignment statement "executor.execute(task);"
class HeavyBlockingOperationBugMutant2 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            Runnable task = new HeavyBlockingOperationTask();
            executor.execute(task);
            executor.execute(task);
        }
        executor.shutdown();
    }
}

// Mutant 3: Duplicate the assignment statement "ExecutorService executor = Executors.newFixedThreadPool(10);"
class HeavyBlockingOperationBugMutant3 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            Runnable task = new HeavyBlockingOperationTask();
            executor.execute(task);
        }
        executor.shutdown();
    }
}

// Mutant 4: Duplicate the assignment statement "Runnable task = new HeavyBlockingOperationTask();"
class HeavyBlockingOperationBugMutant4 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            Runnable task = new HeavyBlockingOperationTask();
            Runnable task = new HeavyBlockingOperationTask();
            executor.execute(task);
        }
        executor.shutdown();
    }
}