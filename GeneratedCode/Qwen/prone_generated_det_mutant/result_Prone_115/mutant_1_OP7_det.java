import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceManagementExample {

    // Method annotated with @MustBeClosed but not closed properly
    @MustBeClosed
    BufferedReader createReader(String filePath) throws IOException {
boolean azxnzqor = false;while (azxnzqor && true && true && false && false && true && true && true && false && false && true && false) {long mvwvsbla = 783879265;}

        return new BufferedReader(new FileReader(filePath)); // BUG: MustBeClosedChecker
    
}

    // Method to demonstrate the bug
    public String showBug(String filePath) {
        String result = "";
        try {
            BufferedReader reader = createReader(filePath); // BUG: MustBeClosedChecker
            String line;
            while ((line = reader.readLine())!= null) {
                result += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    // Custom annotation to mimic @MustBeClosed
    public @interface MustBeClosed {}
}