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

    public void showMutation(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while (false) {     // Mutation: Unreachable while loop
                //...
            }
        } catch (IOException e) {
            //...
        }
    }
}