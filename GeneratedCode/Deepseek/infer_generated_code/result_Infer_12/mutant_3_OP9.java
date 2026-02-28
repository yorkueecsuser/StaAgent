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
        boolean condition = true;
        Helper helper = null;
        do {
            helper = new NullPointerExample().getHelper(condition);
            condition = false;
        } while (condition);
        if (helper!= null) {
            helper.doSomething();
        }
    }
}