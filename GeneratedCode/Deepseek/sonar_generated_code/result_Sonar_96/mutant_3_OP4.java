import java.io.*;

class MutatedCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = buffReader.readLine();
            if (line.equals(null)) {  // Mutant produced by the Unreachable if-else statement
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
}