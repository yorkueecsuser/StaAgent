import java.io.*;

class BuggyCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) {  // BUG: "read" and "readLine" return values should be used
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showBugMutant(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (false) {
                //...
            }
        } catch (IOException e) {
            //...
        }
    }
}