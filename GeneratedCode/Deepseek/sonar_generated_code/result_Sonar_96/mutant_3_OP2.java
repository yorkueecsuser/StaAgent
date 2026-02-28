import java.io.*;

class BuggyCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = buffReader.readLine(); // This line is mutated by duplicating the original line
            while (line!= null) {  // Mutated line
                //...
                line = buffReader.readLine(); // Original line duplicated
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
                line = buffReader.readLine(); // New line added
            }
        } catch (IOException e) {
            //...
        }
    }
}