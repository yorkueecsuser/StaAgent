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
        boolean conditionFor = getCondition(); // Using dynamic condition to avoid unreachable code
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable for loop iteration " + i);
        }
        
        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }

    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable without using a compile-time constant
    }
}