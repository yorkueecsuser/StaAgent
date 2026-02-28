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
    }
}

// Mutant code
@ThreadSafe
class NullPointerExampleMutant {

    public static class HelperMutant {
        public void doSomething() {
            System.out.println("Doing something...");
        }
    }

    @Nullable
    public HelperMutant getHelperMutant(boolean returnNull) {
        if (returnNull) {
            return null;
        }
        return new HelperMutant();
    }

    public void showBugMutant() {
        new NullPointerExampleMutant().getHelperMutant(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}