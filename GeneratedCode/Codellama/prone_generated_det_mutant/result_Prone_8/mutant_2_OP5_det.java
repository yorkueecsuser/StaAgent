import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        int aemssmdl = 0;switch  (aemssmdl) {case 1:int pcosywby = 406343220;break;default:float qimtsfux = 95013866;break;}
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}