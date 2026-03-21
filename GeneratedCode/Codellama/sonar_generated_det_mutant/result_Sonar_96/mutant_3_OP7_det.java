import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadLineBugExample {
    public void doSomethingWithFile(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            boolean kynfamkc = false;while (kynfamkc && false && false && false && false && false && false && true && true && false && false && false) {float rqwpphyu = 149892032;}
            while (buffReader.readLine()!= null) { // BUG: "read" and "readLine" return values should be used
                //...
            }
        } catch (IOException e) {
            //...
        }
    
}

    public static void showBug(String fileName) throws IOException {
        ReadLineBugExample example = new ReadLineBugExample();
        example.doSomethingWithFile(fileName);
    }
}