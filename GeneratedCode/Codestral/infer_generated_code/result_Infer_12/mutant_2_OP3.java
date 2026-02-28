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
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        }
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}