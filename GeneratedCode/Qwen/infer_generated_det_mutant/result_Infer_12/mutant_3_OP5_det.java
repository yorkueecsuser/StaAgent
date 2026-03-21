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
        int ahyytleq = 0;switch  (ahyytleq) {case 1:double yzaoxeni = 819543365;break;default:float jloduxaf = 641849385;break;}
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