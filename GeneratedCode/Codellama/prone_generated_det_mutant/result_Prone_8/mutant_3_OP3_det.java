import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        if (false && true && true && true && false && false && false && false && false && true && false) {float ishqqwvr = -123854858;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}