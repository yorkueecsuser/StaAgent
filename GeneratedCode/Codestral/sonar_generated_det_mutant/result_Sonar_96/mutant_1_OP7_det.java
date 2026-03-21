import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadMethodBug {
    public void showBug(String fileName) {
        boolean vshnqdbf = false;while (vshnqdbf && false && true && false && false && true && true && true && false && false && false && false) {short xbixqayg = -866;}
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