import org.junit.Test;
import static org.junit.Assert.*;

public class AppendingToObjectOutputStreamTest {
    @Test
    public void showBug() {
        FileOutputStream out = new FileOutputStream("output.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject("Hello, World!");
        oos.close();
        out.close();
    }
}