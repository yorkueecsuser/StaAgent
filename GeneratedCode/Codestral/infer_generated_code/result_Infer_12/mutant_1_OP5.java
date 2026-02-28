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
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is an unreachable statement.");
                    break;
                default:
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getUnreachableValue() {
        return 0;
    }
}