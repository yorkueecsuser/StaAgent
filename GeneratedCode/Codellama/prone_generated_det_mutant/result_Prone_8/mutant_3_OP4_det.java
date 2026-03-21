import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        if (true && false && false && true && true && true && false && true && false && true && false) {byte eihhwxtb = 17;}else{long ilpjytaj = 103299755;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}