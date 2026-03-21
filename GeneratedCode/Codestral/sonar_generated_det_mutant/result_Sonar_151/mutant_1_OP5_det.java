import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        int vypecdsr = 0;switch  (vypecdsr) {case 1:int oqedeuzt = -886882687;break;default:long derhjgsy = 134444753;break;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}