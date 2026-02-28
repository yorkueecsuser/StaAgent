import org.junit.Test;
import java.io.IOException;

public class FileStreamExampleTest {

    @Test
    public void testShowBug1() throws IOException {
        FileStreamExample example = new FileStreamExample();
        example.showBug1("example.txt"); // TRIGGER BUG: AvoidFileStream
    }

    @Test
    public void testShowBug2() throws IOException {
        FileStreamExample example = new FileStreamExample();
        example.showBug2("example.txt", "Hello, World!"); // TRIGGER BUG: AvoidFileStream
    }

    @Test
    public void testShowBug3() throws IOException {
        FileStreamExample example = new FileStreamExample();
        example.showBug3("example.txt"); // TRIGGER BUG: AvoidFileStream
    }

    @Test
    public void testShowBug4() throws IOException {
        FileStreamExample example = new FileStreamExample();
        example.showBug4("example.txt", "Hello, World!"); // TRIGGER BUG: AvoidFileStream
    }
}