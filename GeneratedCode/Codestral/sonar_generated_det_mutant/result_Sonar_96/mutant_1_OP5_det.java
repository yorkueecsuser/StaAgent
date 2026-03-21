import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadMethodBug {
    public void showBug(String fileName) {
        int qyvcrent = 0;switch  (qyvcrent) {case 1:double pgidgcga = -25698818;break;default:short ptellrbo = 3842;break;}
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