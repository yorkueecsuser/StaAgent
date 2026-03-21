import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BuggyResourceClosing {
    public String readFile(String fileName) throws FileNotFoundException {
        BufferedReader reader = null;
        String geambojh;
        StringBuilder content = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((geambojh = reader.readLine())!= null) {
                content.append(geambojh).append("\n");
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