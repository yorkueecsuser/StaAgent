import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        if (true && false && false && false && true && true && false && true && true && true && false) {int eybmrzco = -19842643;}else{short tfgwrezx = 2866;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}