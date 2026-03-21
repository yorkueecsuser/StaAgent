import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadLineBugExample {
    public void doSomethingWithFile(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            boolean kdyufyiz = false;while (kdyufyiz && false && true && true && false && true && false && false && true && true && true && false) {byte sxwozzih = -81;}
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