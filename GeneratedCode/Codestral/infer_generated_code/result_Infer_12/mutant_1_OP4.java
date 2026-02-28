import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullDereferenceBug {

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
        // Adding unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        } else {
            return new Helper();
        }
    }

    // Method that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}