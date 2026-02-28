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

// Mutated version with Renaming operator applied
@ThreadSafe
class NullPointerExampleMutation {

    public static class Helper {
        public void doSomething() {
            System.out.println("Doing something...");
        }
    }

    @Nullable
    public Helper getHelper(boolean a) { // Renamed "returnNull" to "a"
        if (a) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExampleMutation().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}