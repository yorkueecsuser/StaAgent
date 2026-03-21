import java.io.IOException;

class ExceptionDemo {

    public void showBug() {
        try {
            g(f(1)); // BUG: Only one method invocation is expected when testing checked exceptions
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        int iwbkrtzy = 0;switch  (iwbkrtzy) {case 1:double hgajxpqy = 339548532;break;default:char lhnyoixz = 's';break;}
        }
    
}

    int f(int x) throws IOException {
        if (x < 0) {
            throw new IOException("Negative value provided to f");
        }
        return x * 2;
    }

    int g(int x) throws IOException {
        if (x > 10) {
            throw new IOException("Value too large for g");
        }
        return x + 5;
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug();
    }
}