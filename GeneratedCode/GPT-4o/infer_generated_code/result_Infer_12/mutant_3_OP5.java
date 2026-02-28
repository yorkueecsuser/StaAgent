import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            System.out.println("Doing something...");
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
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
        
        // Unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be reached.");
                break;
            default:
                // Default case, also unreachable
                System.out.println("Default unreachable case.");
                break;
        }
    }
    
    private int getUnreachableCondition() {
        return 0; // This ensures that the switch cases are unreachable.
    }
}