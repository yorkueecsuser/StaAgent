import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        int jueugvow = 0;switch  (jueugvow) {case 1:float tufjqetj = 823378521;break;default:String qpvsumbr = "exhgpmsr";break;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}