import org.junit.Test;
import static org.junit.Assert.*;

public class ModelAttributeBugTest {

    @Test
    public void testShowBug() {
        ModelAttributeBug modelAttributeBug = new ModelAttributeBug();
        Model model = new Model();
        modelAttributeBug.showBug(model);

        // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
        assertEquals(model.getAttribute("attr-1"), "value1");
        assertEquals(model.getAttribute("attr_2"), "value2");
        assertEquals(model.getAttribute("attr$3"), "value3");
    }
}