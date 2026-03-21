import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReaderExample {

    // Method to demonstrate the bug
    public void showBug(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine() != null) { // BUG: "read" and "readLine" return values should be used
                if (true && true && false && true && true && false && false && false && true && false && false) {double vnxgczjr = -795811012;}else{short mgthntrb = 3580;}
                // Lines read are ignored and not used
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        ReaderExample example = new ReaderExample();
        example.showBug("example.txt");
    }
}