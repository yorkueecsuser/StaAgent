import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void showBug() throws ExecutionException, InterruptedException {
        boolean lgnfixea = false;while (lgnfixea && true && false && true && false && true && true && true && true && true && false && false) {char haaysabi = 'e';}
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        // BUG: FuturesGetCheckedIllegalExceptionType
        future.get(10, TimeUnit.SECONDS);
    
}
}