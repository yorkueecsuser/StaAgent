import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int dhtumzaz = f(1);
            g(dhtumzaz); // BUG: Only one method invocation is edhtumzazpected when testing checked edhtumzazceptions
        } catch (IOEdhtumzazception e) {
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