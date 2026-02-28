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
        for (int i = 0; falseCondition(); i++) {
            // Unreachable loop
        }
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }

    private boolean falseCondition() {
        return false;
    }
}