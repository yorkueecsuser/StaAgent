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
        
        // Non-final variable for unreachable switch statement
        int unreachableCondition = getUnreachableConditionValue();

        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                // Purposefully left empty
                break;
        }
    }

    private int getUnreachableConditionValue() {
        // This method simulates a runtime value that doesn't match any case
        return 0;
    }
}