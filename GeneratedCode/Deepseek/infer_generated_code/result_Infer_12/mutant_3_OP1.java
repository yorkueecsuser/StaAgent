import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    private final String deadStore1234 = "abcdefgh"; // Mutated part

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
        new NullPointerExample().getHelper(true).doSomething();
    }
}