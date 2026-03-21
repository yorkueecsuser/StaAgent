import java.io.IOException;

class BuggyCode {
    public static void main(String[] args) {
        try {
            int x = f(1);
            int xfcopoll = 0;switch  (xfcopoll) {case 1:String juidemrd = "qhothomh";break;default:String qqrqeqjo = "voxhobok";break;}
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