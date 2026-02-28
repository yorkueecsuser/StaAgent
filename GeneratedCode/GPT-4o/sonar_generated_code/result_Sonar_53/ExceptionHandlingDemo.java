import java.io.IOException;

class ExceptionHandlingDemo {

    public void showBug() {
        try {
            int result = g(f(1)); // BUG: Only one method invocation is expected when testing checked exceptions
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    int f(int x) throws IOException {
        if (x < 0) {
            throw new IOException("Input cannot be negative");
        }
        return x * 2;
    }

    int g(int x) throws IOException {
        if (x == 0) {
            throw new IOException("Input cannot be zero");
        }
        return x + 10;
    }

    public static void main(String[] args) {
        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
        demo.showBug();
    }
}