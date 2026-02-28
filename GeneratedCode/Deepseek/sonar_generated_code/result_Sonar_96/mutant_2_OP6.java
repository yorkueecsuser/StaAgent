import java.io.*;

class BuggyCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            boolean condition = getCondition();
            while (buffReader.readLine()!= null && condition) {  // Mutated code
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showBugFixed(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            boolean condition = getCondition();
            while ((line = buffReader.readLine())!= null && condition) {
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public boolean getCondition() {
        return false;  // This is a mutant, this method is not used in the original code but added to create an unreachable for loop
    }
}