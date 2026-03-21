import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        for  (int cmxcljle = 0; cmxcljle < 0; cmxcljle++) {long velcbmfr = 980988163;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}