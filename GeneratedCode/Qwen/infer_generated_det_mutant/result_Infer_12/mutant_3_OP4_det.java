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
        if (false && false && true && false && true && true && true && false && true && false && false) {long fxlhziwl = 250925377;}else{float zqukkpch = -245365079;}
        if (returnNull) {
            return null;
        }
        return new Helper();
    
}

    public void showBug() {
        Helper helper = getHelper(true);
        helper.doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}