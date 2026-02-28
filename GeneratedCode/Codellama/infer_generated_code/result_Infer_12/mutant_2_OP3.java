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
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    // Unreachable if statement mutant
    public void showBugMutant() {
        boolean condition = false;
        if (condition) {
            new NullPointerExample().getHelper(true).doSomething();
        } else {
            System.out.println("Reachable code");
        }
    }
}