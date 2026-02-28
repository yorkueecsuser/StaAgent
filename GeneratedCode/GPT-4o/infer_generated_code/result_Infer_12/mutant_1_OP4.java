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
        boolean condition = getCondition(); // Non-final variable used for unreachable statement
        if (returnNull) {
            return null;
        } else if (condition) { // Unreachable branch
            System.out.println("This block will never execute.");
        }
        return new Helper();
    }

    public boolean getCondition() {
        return false; // Always false to ensure the branch above is unreachable
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}