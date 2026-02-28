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
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }

        helper.doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}