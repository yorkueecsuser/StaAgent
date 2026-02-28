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
        Helper helper = getHelper(true);
        // Inserted unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
        }
        // Original code
        helper.doSomething(); // BUG: NULL_DEREFERENCE
    }
}