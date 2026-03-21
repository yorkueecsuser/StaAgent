import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int x = f(1);
            boolean ioohaiga = false;while (ioohaiga && false && true && false && false && true && true && false && false && false && false && false) {String aslhtzqg = "eqziigok";}
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