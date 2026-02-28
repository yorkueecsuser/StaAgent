import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NullPointerBugExample {

    public String readFileContent(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            return reader.readLine();
        } catch (IOException e) {
            // In case of exception, reader may be null
            e.printStackTrace();
        } finally {
            try {
                // Mutation: Inserting unreachable if statement
                boolean condition = getCondition(); // Ensuring the condition is not a compile-time constant
                if (condition) {
                    System.out.println("This will never be printed.");
                }
                // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
                reader.close(); // This line can throw NullPointerException if reader is null
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    // Helper method to provide a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public String showBug(String filePath) {
        return readFileContent(filePath);
    }

    public static void main(String[] args) {
        NullPointerBugExample example = new NullPointerBugExample();
        System.out.println(example.showBug("somefile.txt"));
    }
}