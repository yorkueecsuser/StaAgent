import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadMethodBug {
    public void showBug(String fileName) {
        int gxldkdtj = 0;switch  (gxldkdtj) {case 1:long dyyclsft = -196920815;break;default:boolean qptadfeq = false;break;}
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) { // Noncompliant, bug: return value is ignored
                //...
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        ReadMethodBug bugExample = new ReadMethodBug();
        bugExample.showBug("example.txt");
    }
}