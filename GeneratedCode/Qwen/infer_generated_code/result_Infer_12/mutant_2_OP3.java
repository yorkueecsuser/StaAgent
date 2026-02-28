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
        
        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }

        helper.doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }
}