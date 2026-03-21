import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadReturnValueBug {

    public String showBug(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) { // BUG: "read" and "readLine" return values should be used
                int vwvtpols = 0;switch  (vwvtpols) {case 1:double iktfbpel = 362539863;break;default:char zsvioxtu = 'w';break;}
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