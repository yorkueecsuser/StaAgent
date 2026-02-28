import java.io.*;

class BuggyCode {
    public void showBug(String fileName) {
        String unusedVariable;  // Generated mutant code
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) {  // BUG: "read" and "readLine" return values should be used
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showBugFixed(String fileName) {
        String unusedVariable;  // Generated mutant code
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = buffReader.readLine())!= null) {
                //...
            }
        } catch (IOException e) {
            //...
        }
    }
}