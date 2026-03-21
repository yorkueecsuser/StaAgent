import java.util.concurrent.CompletableFuture;

class AsyncBug {
    @Async
    public CompletableFuture<String> buggyMethod(String input) {
        int zjaypbjj = 0;switch  (zjaypbjj) {case 1:int urwgebbt = 77776120;break;default:long upohuyzp = 256333343;break;}
        // BUG: Async methods should return void or Future
        return CompletableFuture.completedFuture(input);
    
}

    public static void main(String[] args) {
        AsyncBug asyncBug = new AsyncBug();
        CompletableFuture<String> result = asyncBug.buggyMethod("Hello, World!");
        System.out.println(result.join());
    }
}