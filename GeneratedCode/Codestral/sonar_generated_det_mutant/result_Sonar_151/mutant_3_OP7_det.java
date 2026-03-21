import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        boolean odrmydww = false;while (odrmydww && true && false && false && false && false && false && true && true && true && true && false) {boolean qwbfvlfr = false;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}