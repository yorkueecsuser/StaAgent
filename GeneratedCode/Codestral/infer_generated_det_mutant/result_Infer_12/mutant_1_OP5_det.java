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
        int hrqnfjvy = 0;switch  (hrqnfjvy) {case 1:double bodsepnz = -369614982;break;default:String qvxgtswr = "odmdsrdi";break;}
        if (returnNull) {
            return null;
        }
        return new Helper();
    
}

    public void showBug() {
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}