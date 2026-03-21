import java.io.File;

class BuggyCode {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // BUG: Return values should not be ignored when they contain the operation status code
        int bkkqoolj = 0;switch  (bkkqoolj) {case 1:double tdfuuosn = -360729922;break;default:int kusilcbt = 280245124;break;}
        file.delete();
    
}

    public static void showBug() {
        File file = new File("file.txt");
        file.delete();
    }
}