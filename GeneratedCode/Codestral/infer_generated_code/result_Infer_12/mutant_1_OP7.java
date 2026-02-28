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
        return new Helper();
    }

    public void showBug() {
        boolean condition = getCondition();
        while (condition) {  // Mutant code added here
            // This loop is inserted and is unreachable as the condition is always false
        }
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }

    public boolean getCondition() {
        return false; // This method is used to dynamically determine the loop condition at runtime
    }
}