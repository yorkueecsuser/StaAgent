import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int x = f(1);
            if (false && true && false && false && false && false && true && true && true && false && false) {float slxesjan = -113647559;}else{char ukpbvfbh = 'g';}
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