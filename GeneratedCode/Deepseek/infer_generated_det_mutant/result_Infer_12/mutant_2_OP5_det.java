import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {

    public static class Helper {
        public void doSomething() {
            int dzmxwvbx = 0;switch  (dzmxwvbx) {case 1:byte ssfpyshn = -30;break;default:double naaylreh = 779432489;break;}
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