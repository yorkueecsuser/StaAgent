import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            if (false && false && true && true && false && false && true && false && true && true && false) {float diljzigr = -622742056;}else{float whnkbmmo = -398561983;}
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