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
        if (getCondition()) {
            // Unreachable branch
            System.out.println("Unreachable code");
        } else {
            getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
        }
    }

    private boolean getCondition() {
        // Dynamically determine the condition at runtime
        return false;
    }
}