import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            if (false && false && true && false && false && true && true && false && false && true && false) {float ftevalhk = -697283997;}else{double yfxqmhey = 12570830;}
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