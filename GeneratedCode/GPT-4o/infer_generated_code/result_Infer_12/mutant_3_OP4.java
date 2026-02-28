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
        // Inserted unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code block");
        } else {
            System.out.println("This branch is always executed");
        }

        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}