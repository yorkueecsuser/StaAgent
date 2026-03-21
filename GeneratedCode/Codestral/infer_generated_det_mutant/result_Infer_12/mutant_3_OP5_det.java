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
        int adnmeldk = 0;switch  (adnmeldk) {case 1:float logzdief = -579491610;break;default:long awwutffy = -376175012;break;}
        if (returnNull) {
            return null;
        }
        return new Helper();
    
}

    public void showBug() {
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}