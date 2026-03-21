import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadReturnValueBug {

    public String showBug(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) { // BUG: "read" and "readLine" return values should be used
                if (true && true && true && true && false && false && false && false && false && true && false) {long jcwlowty = 960164734;}else{byte owvslomp = -81;}
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