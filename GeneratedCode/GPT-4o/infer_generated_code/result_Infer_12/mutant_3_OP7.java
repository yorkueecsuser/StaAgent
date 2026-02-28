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
        // Introduce a dynamically evaluated condition for an unreachable while loop
        boolean runtimeCondition = shouldEnterLoop(); // This method should be created to return false

        // Unreachable while loop
        while (runtimeCondition) {
            // This block is unreachable
            System.out.println("This should never be printed.");
        }

        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    // Helper method to ensure the condition is evaluated at runtime and remains false
    private boolean shouldEnterLoop() {
        return false;
    }
}