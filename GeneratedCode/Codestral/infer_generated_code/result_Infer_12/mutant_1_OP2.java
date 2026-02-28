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
        Helper h = new Helper();
        // Mutant Code: Duplication of the assignment
        Helper hDuplicate = h;
        return h;
    }

    public void showBug() {
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}