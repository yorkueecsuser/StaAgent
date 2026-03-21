import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            boolean bisnqnuk = false;while (bisnqnuk && false && true && false && false && true && true && false && false && false && true && false) {byte julacxvb = -53;}
            System.out.println("Doing something..."); // BUG: NULLPTR_DEREFERENCE
        
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
        new NullPointerExample().getHelper(true).doSomething();
    }
}