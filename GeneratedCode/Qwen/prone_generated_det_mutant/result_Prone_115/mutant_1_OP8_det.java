import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceManagementExample {

    // Method annotated with @MustBeClosed but not closed properly
    @MustBeClosed
    BufferedReader createReader(String filePath) throws IOException {
        return new BufferedReader(new FileReader(filePath)); // BUG: MustBeClosedChecker
    }

    // Method to demonstrate the bug
    public String showBug(String filePath) {
        String npwetpyt = "";
        try {
            BufferedReader reader = createReader(filePath); // BUG: MustBeClosedChecker
            String mgkkbkjb;
            while ((mgkkbkjb = reader.readLine())!= null) {
                npwetpyt += mgkkbkjb + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return npwetpyt;
    }

    // Custom annotation to mimic @MustBeClosed
    public @interface MustBeClosed {}
}