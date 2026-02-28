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

// Unreachable if-else statement mutant
@ThreadSafe
class NullPointerExampleMutant {
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

    // Unreachable if-else statement mutant
    public void showBugMutant() {
        if (false) {
            new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
        } else {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }
}