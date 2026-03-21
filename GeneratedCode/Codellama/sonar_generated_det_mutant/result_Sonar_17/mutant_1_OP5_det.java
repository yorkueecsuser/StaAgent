import java.util.concurrent.CompletableFuture;

class AsyncBug {
    @Async
    public CompletableFuture<String> buggyMethod(String input) {
        int gvmgyxvd = 0;switch  (gvmgyxvd) {case 1:boolean wvugajmh = true;break;default:byte dzzgfbqw = -4;break;}
        // BUG: Async methods should return void or Future
        return CompletableFuture.completedFuture(input);
    
}

    public static void main(String[] args) {
        AsyncBug asyncBug = new AsyncBug();
        CompletableFuture<String> result = asyncBug.buggyMethod("Hello, World!");
        System.out.println(result.join());
    }
}