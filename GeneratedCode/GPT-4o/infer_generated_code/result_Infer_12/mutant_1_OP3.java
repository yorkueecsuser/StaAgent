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
        // Introduce a non-final variable to create an unreachable if statement
        boolean unreachableCondition = getCondition();

        // Unreachable if statement
        if (unreachableCondition) {
            System.out.println("This will never print.");
        }

        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    // Helper method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }
}