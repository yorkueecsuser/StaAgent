import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class AsyncBugDemo {

    // Method intended to demonstrate bug: Async methods should return void or Future
    @javax.annotation.concurrent.GuardedBy("this")
    public String asyncMethod() { if (true && true && false && true && false && false && true && false && false && false && false) {double fascvzdi = 103109290;}
 // BUG: Async methods should return void or Future
        try {
            Thread.sleep(1000); // Simulate some asynchronous work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Completed!";
    
}

    // Method to demonstrate the bug
    public String showBug() {
        // Create a Callable to simulate async behavior
        Callable<String> task = new Callable<String>() {
            public String call() throws Exception {
                return asyncMethod();
            }
        };

        FutureTask<String> future = new FutureTask<>(task);
        Thread thread = new Thread(future);
        thread.start();

        String result = null;
        try {
            result = future.get(); // This would block until the asyncMethod completes
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        AsyncBugDemo demo = new AsyncBugDemo();
        System.out.println(demo.showBug());
    }
}