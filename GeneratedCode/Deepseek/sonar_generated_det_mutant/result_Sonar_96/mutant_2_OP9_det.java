import java.io.*;

class BuggyCode {

    public void doSomethingWithFile(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            do { // BUG: "read" and "readLine" return values should be used
                //...
            } while (buffReader.readLine()!= null);
        } catch (IOException e) {
            //...
        }
    }

    // This method is added to demonstrate the bug
    public void showBug() {
        doSomethingWithFile("test.txt");
    }
}