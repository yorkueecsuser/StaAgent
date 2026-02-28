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

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        if (getUnreachableCondition()) {
            int value = 0;
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This is unreachable code.");
                    break;
            }
        }
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}