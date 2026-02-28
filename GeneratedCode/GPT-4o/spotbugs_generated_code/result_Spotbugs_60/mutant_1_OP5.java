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
                // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
                reader.close(); // This line can throw NullPointerException if reader is null
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method ensures the switch is unreachable
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code");
                break;
            default:
                System.out.println("This is also unreachable code");
                break;
        }
        
        return null;
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        // This function always returns a value that doesn't match any case
        return 0; // Use a value that matches none of the cases
    }

    public String showBug(String filePath) {
        return readFileContent(filePath);
    }

    public static void main(String[] args) {
        NullPointerBugExample example = new NullPointerBugExample();
        System.out.println(example.showBug("somefile.txt"));
    }
}