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

    // Mutant 1: Renaming variable `returnNull` to `shouldReturnNull`
    @Nullable
    public Helper getHelper(boolean shouldReturnNull) {
        if (shouldReturnNull) {
            return null;
        }
        return new Helper();
    }

    // Mutant 2: Renaming variable `new Helper()` to `newHelper`
    @Nullable
    public Helper getHelper(boolean returnNull) {
        if (returnNull) {
            return null;
        }
        return newHelper();
    }

    // Mutant 3: Renaming method `doSomething()` to `performSomething()`
    public void showBug() {
        new NullPointerExample().getHelper(true).performSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}