import java.io.File;

class BuggyCode {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // BUG: Return values should not be ignored when they contain the operation status code
        for  (int jbbnjyjr = 0; jbbnjyjr < 0; jbbnjyjr++) {float skfyzmkd = 782565786;}
        file.delete();
    
}

    public static void showBug() {
        File file = new File("file.txt");
        file.delete();
    }
}