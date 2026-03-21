import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        boolean bkjuaoqg = false;while (bkjuaoqg && true && true && true && false && true && false && false && true && false && true && false) {short kaacftqn = -1996;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}