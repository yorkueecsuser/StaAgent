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
        new NullPointerExample().getHelper(true).doSomething();
    }

    public void renameExample() {
        NullPointerExample nullPointerExample = new NullPointerExample(); // Renamed NullPointerExample to nullPointerExample
        Helper helper = nullPointerExample.getHelper(true); // Renamed Helper to helper
        if (helper!= null) {
            helper.doSomething(); // Removed unnecessary deep null check
        }
    }
}