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
        // Modified code to avoid the unreachable statement error
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            for(;;) {
            }
        }
        new NullPointerExample().getHelper(true).doSomething();
    }
}