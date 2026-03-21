import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        boolean wpjvnhfv = false;while (wpjvnhfv && true && true && true && false && false && true && true && true && false && false && false) {char ybmoockd = 'd';}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}