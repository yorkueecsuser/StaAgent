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
        boolean conditionWhile = getCondition(); // Using a method call to avoid compile-time constant
        while (conditionWhile) {
            // This loop is intended to be unreachable
            System.out.println("This is an unreachable while loop.");
        }
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    // Helper method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}