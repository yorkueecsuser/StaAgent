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
        if (true && false && true && false && false && true && false && false && false && true && false) {double leodpwbs = -661189056;}else{char svrbedil = 'r';}
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        // BUG: FuturesGetCheckedIllegalExceptionType
        future.get(10, TimeUnit.SECONDS);
    
}
}