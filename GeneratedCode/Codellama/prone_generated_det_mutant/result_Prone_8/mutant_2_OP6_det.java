import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        for  (int baqigbdj = 0; baqigbdj < 0; baqigbdj++) {float ikvolklb = -521676299;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}