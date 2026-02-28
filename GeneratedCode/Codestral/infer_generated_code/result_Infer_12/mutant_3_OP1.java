import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;
import java.util.Random;

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
        int deadStoreVariable = new Random().nextInt(); // Introducing a dead store variable
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}