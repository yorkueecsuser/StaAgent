import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int hhwlozef = f(1);
            g(hhwlozef); // BUG: Only one method invocation is ehhwlozefpected when testing checked ehhwlozefceptions
        } catch (IOEhhwlozefception e) {
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