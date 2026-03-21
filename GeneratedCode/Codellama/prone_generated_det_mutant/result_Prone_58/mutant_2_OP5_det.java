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
        int bzcqmgrt = 0;switch  (bzcqmgrt) {case 1:float fbivtwad = 59193108;break;default:double ppbvgppx = -831854007;break;}
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        // BUG: FuturesGetCheckedIllegalExceptionType
        future.get(10, TimeUnit.SECONDS);
    
}
}