import java.io.IOException;

class ExceptionBugDemo {

    public void showBug() throws IOException {
        // BUG: Only one method invocation is expected when testing checked exceptions
        int result = g(f(1)); // This line contains the bug
        System.out.println("Result: " + result);
    }

    int f(int x) throws IOException {
        if (x < 0) {
            throw new IOException("Negative value provided");
        }
        return x * 2;
    }

    int g(int x) throws IOException {
        if (x > 10) {
            throw new IOException("Value exceeds limit");
        }
        return x + 5;
    }

    public static void main(String[] args) {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        try {
            demo.showBug();
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
}