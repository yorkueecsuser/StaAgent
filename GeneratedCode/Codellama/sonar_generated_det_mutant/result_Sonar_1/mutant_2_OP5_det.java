import java.io.File;

class BuggyCode {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // BUG: Return values should not be ignored when they contain the operation status code
        int lgoklizb = 0;switch  (lgoklizb) {case 1:float rmjvhpsl = 65823093;break;default:double sblsnjmq = -496373215;break;}
        file.delete();
    
}

    public static void showBug() {
        File file = new File("file.txt");
        file.delete();
    }
}