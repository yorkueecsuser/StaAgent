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
        if (false && false && false && true && true && true && false && true && false && true && false) {long ewzbkdcy = -364416036;}
        if (returnNull) {
            return null;
        }
        return new Helper();
    
}

    public void showBug() {
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}