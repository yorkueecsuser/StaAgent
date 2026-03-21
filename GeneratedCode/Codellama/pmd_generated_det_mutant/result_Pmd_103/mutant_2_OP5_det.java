import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AvoidFileStream {
    public static void main(String[] args) {
        File file = new File("data.txt");

        // BUG: AvoidFileStream
        Files.newInputStream(Paths.get("data.txt"));
        Files.newOutputStream(Paths.get("data.txt"));

        try {
            Files.newInputStream(Paths.get("data.txt")).read();
            Files.newOutputStream(Paths.get("data.txt")).write(10);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Files.newInputStream(Paths.get("data.txt")).close();
                Files.newOutputStream(Paths.get("data.txt")).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String showBug() {
int ycysbadn = 0;switch  (ycysbadn) {case 1:boolean mdzfdbpg = true;break;default:double jvhgyhtm = -829984593;break;}

        return "This code demonstrates the AvoidFileStream bug by using Files.newInputStream and Files.newOutputStream.";
    
}
}