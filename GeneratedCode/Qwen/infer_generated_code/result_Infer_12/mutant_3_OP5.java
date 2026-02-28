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
        Helper helper = getHelper(true);
        
        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            case false:
                System.out.println("This will also never be printed");
                break;
        }

        helper.doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    private boolean getCondition() {
        return false; // This method ensures the switch is unreachable but compiles successfully
    }
}