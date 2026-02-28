import java.io.*;

class BuggyCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) {
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showBugFixed(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = buffReader.readLine())!= null) {
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showUnreachableLoop(String fileName) {
        boolean condition = false; // Non-final and not getCondition()
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (condition) { // unreachable loop, but is not in the showBug or showBugFixed methods
                //...
            }
        } catch (IOException e) {
            //...
        }
    }
}