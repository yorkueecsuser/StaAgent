import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

public class ModelAttributeBugExampleTest {

    @Test
    public void testInvalidAttributeName() {
        ModelAttributeBugExample example = new ModelAttributeBugExample();
        Model model = new BindingAwareModelMap();
        assertEquals("This is invalid", example.showBug(model)); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
    }
}