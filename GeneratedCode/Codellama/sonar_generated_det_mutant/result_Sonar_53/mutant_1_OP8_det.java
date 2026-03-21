import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int mnxnwmjq = f(1);
            g(mnxnwmjq); // BUG: Only one method invocation is emnxnwmjqpected when testing checked emnxnwmjqceptions
        } catch (IOEmnxnwmjqception e) {
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