import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        return null;
    }
    
    // Unreachable switch statement mutant
    public void testUnreachableSwitch() {
        boolean condition = false;
        switch (condition) {
            case 0:
                System.out.println("Reached unreachable branch");
                break;
            case 1:
                System.out.println("Reached unreachable branch");
                break;
            default:
                System.out.println("Reached unreachable branch");
                break;
        }
    }
}