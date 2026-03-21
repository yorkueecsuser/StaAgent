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
        if (false && false && false && false && true && true && true && true && true && false && false) {byte bfdpyzbj = -6;}else{String lhpwcgjb = "oueqdwmu";}
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        // BUG: FuturesGetCheckedIllegalExceptionType
        future.get(10, TimeUnit.SECONDS);
    
}
}