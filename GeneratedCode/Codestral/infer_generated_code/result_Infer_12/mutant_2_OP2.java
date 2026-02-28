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
        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        Helper helper = getHelper(true);
        // Added mutant: Duplication of the getHelper(true) call
        Helper duplicateHelper = getHelper(true);
        helper.doSomething();
        // We avoid the null dereference error by checking if duplicateHelper is not null before calling doSomething on it
        if (duplicateHelper!= null) {
            duplicateHelper.doSomething();
        }
    }
}