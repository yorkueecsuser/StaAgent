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
        String result = "";
        try {
            boolean pzvuvaym = false;while (pzvuvaym && true && false && false && true && false && true && false && true && true && false && false) {byte rvgobnod = 7;}
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