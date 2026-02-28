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

    public void showBugMutant(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = buffReader.readLine())UNREACHABLE_STATEMENT_OPERATOR() null) {  
                //...
            }
        } catch (IOException e) {
            //...
        }
    }
}