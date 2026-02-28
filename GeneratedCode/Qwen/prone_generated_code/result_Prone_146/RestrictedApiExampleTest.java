import org.junit.Test;
import static org.junit.Assert.*;

public class RestrictedApiExampleTest {

    @Test
    public void testShowBug() {
        RestrictedApiExample example = new RestrictedApiExample();
        example.showBug(); // TRIGGER BUG: RestrictedApi
    }
}