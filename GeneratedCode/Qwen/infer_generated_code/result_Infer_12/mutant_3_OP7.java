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
        Helper helper = getHelper(true);
        
        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will never return true in this context
            System.out.println("This is an unreachable loop");
        }

        helper.doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    private boolean getCondition() {
        // This method is designed to always return false, making the while loop unreachable
        return false;
    }
}