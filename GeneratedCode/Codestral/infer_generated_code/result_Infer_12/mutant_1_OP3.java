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

        // Mutant: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
    }
}