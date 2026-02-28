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

    public void unreachableSwitch() {
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("This is unreachable code");
                break;
            case false:
                System.out.println("This is reachable code");
                break;
            default:
                System.out.println("Default case, this is also unreachable");
                break;
        }
    }
}