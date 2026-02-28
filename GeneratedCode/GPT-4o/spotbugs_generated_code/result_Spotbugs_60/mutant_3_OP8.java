import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NullPointerBugExample {

    public String readFileContent(String filePath) {
        BufferedReader r = null; // Renamed variable 'reader' to 'r'
        try {
            r = new BufferedReader(new FileReader(filePath));
            return r.readLine();
        } catch (IOException e) {
            // In case of exception, reader may be null
            e.printStackTrace();
        } finally {
            try {
                // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
                r.close(); // This line can throw NullPointerException if r is null
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String showBug(String filePath) {
        return readFileContent(filePath);
    }

    public static void main(String[] args) {
        NullPointerBugExample e = new NullPointerBugExample(); // Renamed variable 'example' to 'e'
        System.out.println(e.showBug("somefile.txt"));
    }
}