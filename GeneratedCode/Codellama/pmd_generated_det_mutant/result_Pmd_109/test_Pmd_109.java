import org.junit.Test;
import static org.junit.Assert.*;

class InefficientStringBufferingTest {
    @Test
    public void testInefficientStringBuffering() {
        String text = "Hello, ";
        String name = "World";
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    }
}