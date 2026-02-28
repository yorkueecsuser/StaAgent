import java.io.*;

class MutantCode {
    public void showMutant(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while (line.equals("")) { // Unreachable while loop
                line = buffReader.readLine();
                //...
            }
        } catch (IOException e) {
            //...
        }
    }

    public void showMutantFixed(String fileName) {
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