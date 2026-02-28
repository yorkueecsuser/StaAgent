import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileStuffTest {
    FileStuff fileStuff = new FileStuff();

    @Test
    public void testShowBug() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[1000000000]); // TRIGGER BUG: UseIOStreamsWithApacheCommonsFileItem
        fileStuff.showBug(inputStream);
    }
}