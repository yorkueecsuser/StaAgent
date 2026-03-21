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
        for  (int xxjgsfrv = 0; xxjgsfrv < 0; xxjgsfrv++) {int unjpahvz = -566286726;}
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