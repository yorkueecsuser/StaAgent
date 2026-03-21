import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        if (true && false && false && true && false && true && true && false && true && false && false) {byte jbsadmiu = -92;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}