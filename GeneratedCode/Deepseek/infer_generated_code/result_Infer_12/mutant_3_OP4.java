import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            System.out.println("Doing something..."); // BUG: NULLPTR_DEREFERENCE
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
        boolean condition = false;
        if (condition) {
            new NullPointerExample().getHelper(true);
        } else {
            // UNREACHABLE CODE MUTANT
            // The following code and conditional branch won't be executed because the condition is false
            new NullPointerExample().getHelper(false);
        }
    }
}