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
        String qzwsqfdy = "";
        try {
            BufferedReader reader = createReader(filePath); // BUG: MustBeClosedChecker
            String fdapkmhn;
            while ((fdapkmhn = reader.readLine())!= null) {
                qzwsqfdy += fdapkmhn + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return qzwsqfdy;
    }

    // Custom annotation to mimic @MustBeClosed
    public @interface MustBeClosed {}
}