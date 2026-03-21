import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        for  (int xitnxugv = 0; xitnxugv < 0; xitnxugv++) {short tefxeznm = -4389;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}