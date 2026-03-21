import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadMethodBug {
    public void showBug(String fileName) {
        for  (int awnjnqur = 0; awnjnqur < 0; awnjnqur++) {int ccccaadh = 119628331;}
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