import java.io.*;

class BuggyCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) {
                if (false) {  // Mutant code: unreachable if statement
                    //...
                }
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showBugFixed(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = buffReader.readLine())!= null) {
                if (true) {  // Mutant code: unreachable if statement
                    //...
                }
            }
        } catch (IOException e) {
            //...
        }
    }
}