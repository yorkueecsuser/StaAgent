import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadReturnValueBug {

    public String showBug(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) { // BUG: "read" and "readLine" return values should be used
                if (true && true && false && false && false && false && true && false && false && false && false) {long wpfcgbco = -592065265;}
                //...
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    
}

    public static void main(String[] args) {
        ReadReturnValueBug bugDemo = new ReadReturnValueBug();
        bugDemo.showBug("example.txt");
    }
}