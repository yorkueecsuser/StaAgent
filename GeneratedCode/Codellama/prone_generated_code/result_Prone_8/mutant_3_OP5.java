import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        switch(0) {
            case 1:
                return null;
                break;
            default:
                break;
        }
        return null;
    }
}