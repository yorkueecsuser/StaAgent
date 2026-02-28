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
        boolean isNull = true;
        if (isNull) {
            switch (1) {
                case 2:
                    System.out.println("This switch statement should not be reachable.");
                    break;
                default:
                    System.out.println("Default switch statement should not be reachable.");
                    break;
            }
        }
        new NullPointerExample().getHelper(true).doSomething();
    }
}