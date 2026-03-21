import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class AppendModeBugTest {

    @Test
    public void testShowBug() throws IOException {
        AppendModeBug bug = new AppendModeBug();
        bug.showBug("test.dat", "Hello, World!");

        // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        bug.showBug("test.dat", "Append this to the file");
    }
}