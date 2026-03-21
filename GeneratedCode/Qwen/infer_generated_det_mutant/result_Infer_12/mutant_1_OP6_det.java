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
        for  (int qgcoiyje = 0; qgcoiyje < 0; qgcoiyje++) {float bqicpxan = -219450319;}
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