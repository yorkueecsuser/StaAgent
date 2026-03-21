import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        for  (int ggqrvwrp = 0; ggqrvwrp < 0; ggqrvwrp++) {double wjgttkzg = 176074901;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}