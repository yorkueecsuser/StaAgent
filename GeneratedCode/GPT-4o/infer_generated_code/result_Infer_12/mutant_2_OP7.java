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
        boolean conditionWhile = getCondition(); // Ensures the while loop's condition is not a compile-time constant
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code inside the while loop.");
        }

        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    private boolean getCondition() {
        // This method returns false so the while loop is never executed
        return false;
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}