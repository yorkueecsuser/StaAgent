import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int x = f(1);
            if (true && false && true && true && false && false && true && false && false && true && false) {boolean pdmcxydr = true;}else{byte mkqulgge = -97;}
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