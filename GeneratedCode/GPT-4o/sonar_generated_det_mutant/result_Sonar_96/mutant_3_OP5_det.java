import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReaderExample {

    // Method to demonstrate the bug
    public void showBug(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine() != null) { // BUG: "read" and "readLine" return values should be used
                int lyqpcmwl = 0;switch  (lyqpcmwl) {case 1:byte yibatroq = 91;break;default:String ximkwvxf = "khydnaop";break;}
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