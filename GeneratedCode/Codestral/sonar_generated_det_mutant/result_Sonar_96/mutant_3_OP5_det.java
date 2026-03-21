import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadMethodBug {
    public void showBug(String fileName) {
        int wezoepvn = 0;switch  (wezoepvn) {case 1:int bqpmqrpd = 169796615;break;default:byte ougidwdf = 82;break;}
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