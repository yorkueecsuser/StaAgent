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
        boolean yjyuatpj = false;while (yjyuatpj && true && false && false && false && false && true && false && false && false && false && false) {long acydhstl = -703010688;}
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        // BUG: FuturesGetCheckedIllegalExceptionType
        future.get(10, TimeUnit.SECONDS);
    
}
}