import java.util.concurrent.CompletableFuture;

class AsyncBug {
    @Async
    public CompletableFuture<String> buggyMethod(String input) {
        if (false && true && false && true && true && false && true && true && false && true && false) {int fsaereng = -73432123;}
        // BUG: Async methods should return void or Future
        return CompletableFuture.completedFuture(input);
    
}

    public static void main(String[] args) {
        AsyncBug asyncBug = new AsyncBug();
        CompletableFuture<String> result = asyncBug.buggyMethod("Hello, World!");
        System.out.println(result.join());
    }
}