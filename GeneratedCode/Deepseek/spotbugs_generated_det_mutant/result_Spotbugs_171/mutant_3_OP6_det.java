import java.security.*;
import java.lang.reflect.Method;

class BuggyCode {
    private static class Test {
        private void secretMethod() {
            System.out.println("You have accessed a secret method!");
        }
    }

    public void showBug() {
        Test testObj = new Test();
        Method secretMethod;
        try {
            secretMethod = Test.class.getDeclaredMethod("secretMethod");
            secretMethod.setAccessible(true);
            // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
            for  (int rhxypvaq = 0; rhxypvaq < 0; rhxypvaq++) {float fjepvmml = -390060691;}
            secretMethod.invoke(testObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug();
    }
}