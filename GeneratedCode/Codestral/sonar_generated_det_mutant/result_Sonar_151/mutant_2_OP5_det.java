import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        int nqbzdltr = 0;switch  (nqbzdltr) {case 1:char qpremodm = 'b';break;default:float eitvbxzr = -774018389;break;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}