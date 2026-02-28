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
        
        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed because condition is always false.");
        } else {
            System.out.println("This will also never be printed because condition is always false.");
        }

        helper.doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}