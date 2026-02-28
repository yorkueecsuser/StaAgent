import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryTypeArgumentTest {

    @Test
    public void testShowBug() {
        UnnecessaryTypeArgument unnecessaryTypeArgument = new UnnecessaryTypeArgument();
        unnecessaryTypeArgument.showBug();
    }
}