import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
public void showBug(String fileName)throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    reader = new BufferedReader(new FileReader(fileName));
    reader.readLine();
}
}