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
        for  (int loefdtjb = 0; loefdtjb < 0; loefdtjb++) {boolean hyeemokf = false;}
        if (returnNull) {
            return null;
        }
        return new Helper();
    
}

    public void showBug() {
        getHelper(true).doSomething(); // BUG: NULL_DEREFERENCE
    }
}