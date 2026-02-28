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
        int deadStoreVariable = 10;   // Dead Store Mutant - unused variable
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
        // Note: The variable 'deadStoreVariable' is not used anywhere in the code.
    }
}