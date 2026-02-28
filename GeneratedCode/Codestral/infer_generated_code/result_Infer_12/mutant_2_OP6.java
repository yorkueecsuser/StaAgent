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
        for (int i = 0; i < 1 && unreachableCondition; i++) { // Mutant: Unreachable for loop
            System.out.println("This loop should never be executed.");
        }
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}