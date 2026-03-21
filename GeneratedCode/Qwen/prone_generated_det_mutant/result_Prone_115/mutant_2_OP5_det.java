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
            int jxfdzvev = 0;switch  (jxfdzvev) {case 1:int mpzlujzb = 474426063;break;default:byte rhdkyhxu = -55;break;}
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