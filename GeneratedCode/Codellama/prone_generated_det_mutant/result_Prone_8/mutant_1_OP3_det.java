import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        if (true && true && false && true && true && true && false && true && false && true && false) {char xmvlnvaz = 'r';}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}