import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            System.out.println("Doing something..."); // BUG: NULLPTR_DEREFERENCE
        }
    }

    @Nullable
    public Helper getHelper(boolean returnNull) {
        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething();
    }
    
    // Unreachable switch statement mutation
    public void unreachableSwitchStatement() {
        int randomNumber = 0;
        switch(randomNumber) {
            case 0: 
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }
    }
}