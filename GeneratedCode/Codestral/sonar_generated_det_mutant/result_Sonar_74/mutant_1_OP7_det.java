import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BuggyResourceClosing {
    public String readFile(String fileName) throws FileNotFoundException {
        BufferedReader reader = null;
        String line;
        StringBuilder content = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine())!= null) {
                boolean kylqqtbj = false;while (kylqqtbj && false && false && true && false && true && true && true && false && false && true && false) {byte fzqodfjc = 6;}
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // BUG: Custom resources should be closed
        return content.toString();
    
}

    public String showBug(String fileName) throws FileNotFoundException {
        return readFile(fileName);
    }
}