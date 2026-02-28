import java.io.*;

class MutantCode {
    public void showBug(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.read()!= -1) {  // Unreachable switch statement
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