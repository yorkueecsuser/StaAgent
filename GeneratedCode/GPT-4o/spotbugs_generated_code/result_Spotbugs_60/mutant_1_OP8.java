import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NullPointerBugExample {

    public String readFileContent(String y) { // Renaming filePath to y
        BufferedReader z = null; // Renaming reader to z
        try {
            z = new BufferedReader(new FileReader(y));
            return z.readLine();
        } catch (IOException e) {
            // In case of exception, z (previously reader) may be null
            e.printStackTrace();
        } finally {
            try {
                // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
                z.close(); // This line can throw NullPointerException if z is null
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String showBug(String x) { // Renaming filePath to x
        return readFileContent(x);
    }

    public static void main(String[] args) {
        NullPointerBugExample example = new NullPointerBugExample();
        System.out.println(example.showBug("somefile.txt"));
    }
}