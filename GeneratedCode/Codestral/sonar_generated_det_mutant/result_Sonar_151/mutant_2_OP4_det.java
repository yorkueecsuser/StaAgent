import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        if (true && false && true && true && false && true && true && true && false && false && false) {long socayrwo = 522008801;}else{String kbkbdiam = "bdibbmwq";}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}