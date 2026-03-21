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
        boolean ufbmzygp = false;while (ufbmzygp && false && false && true && true && false && false && false && false && true && false && false) {char peifgivx = 'r';}
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