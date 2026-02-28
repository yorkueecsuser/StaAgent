import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NullPointerBugExample {

    public String readFileContent(String filePath) {
        BufferedReader reader = null;
        boolean conditionWhile = getCondition(); // Non-final variable to control the loop
        try {
            reader = new BufferedReader(new FileReader(filePath));
            return reader.readLine();
        } catch (IOException e) {
            // In case of exception, reader may be null
            e.printStackTrace();
        } finally {
            try {
                // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
                reader.close(); // This line can throw NullPointerException if reader is null
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Unreachable while loop using a non-final variable for condition
        while (conditionWhile) {
            // This block is unreachable since conditionWhile is always false
            System.out.println("This is an unreachable while loop");
        }
        return null;
    }

    public String showBug(String filePath) {
        return readFileContent(filePath);
    }

    public static void main(String[] args) {
        NullPointerBugExample example = new NullPointerBugExample();
        System.out.println(example.showBug("somefile.txt"));
    }

    // Method to return a non-final variable value used in the while loop condition
    private boolean getCondition() {
        return false; // Always returns false to keep the loop unreachable
    }
}