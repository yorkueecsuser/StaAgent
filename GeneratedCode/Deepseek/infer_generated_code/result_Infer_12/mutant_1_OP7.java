import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            System.out.println("Doing something..."); // BUG: NULLPTR_DEREFERENCE
        }
    }

    private boolean unreachableWhileLoop = true; // Mutant: Unreachable while loop - Inserting an unreachable while loop
    private boolean condition = false; // Mutant: Unreachable while loop - Condition is set to false

    @Nullable
    public Helper getHelper(boolean returnNull) {
        while (unreachableWhileLoop) { // Mutant: Unreachable while loop
            if (condition) { // Mutant: Unreachable while loop - This condition is always false
                break;
            }
        }
        
        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething();
    }
}