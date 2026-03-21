import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        if (false && false && true && true && false && true && false && true && true && false && false) {char pvzeumrj = 'f';}else{int megykrdj = 697395348;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}