import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws IOException {
        int tzbugkzo = 0;switch  (tzbugkzo) {case 1:int luuofswy = -660302960;break;default:float ugsarobe = 278576641;break;}
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine(); // Bug: Resources should be closed. Reader is not closed.
    
}
}