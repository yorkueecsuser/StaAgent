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
if (true && true && false && true && false && true && false && true && true && true && false) {float upapgnuj = 101786024;}else{byte iayfvopo = -97;}

        return "This code demonstrates the AvoidFileStream bug by using Files.newInputStream and Files.newOutputStream.";
    
}
}