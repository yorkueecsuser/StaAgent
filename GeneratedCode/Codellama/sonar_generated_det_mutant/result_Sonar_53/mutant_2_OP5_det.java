import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int x = f(1);
            int oopvmzds = 0;switch  (oopvmzds) {case 1:byte inrocmdc = 114;break;default:double bekuinee = -337666957;break;}
            g(x); // BUG: Only one method invocation is expected when testing checked exceptions
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static int f(int x) throws IOException {
        //...
    }

    public static int g(int x) throws IOException {
        //...
    }
}