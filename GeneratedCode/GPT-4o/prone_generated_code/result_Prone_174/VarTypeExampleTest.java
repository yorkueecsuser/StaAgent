import org.junit.Test;
import static org.junit.Assert.*;

public class VarTypeExampleTest {

    @Test
    public void testShowBug() {
        VarTypeExample example = new VarTypeExample();
        example.showBug(10); // TRIGGER BUG: VarTypeName
    }

    @Test
    public void testShowBugWithDifferentValue() {
        VarTypeExample example = new VarTypeExample();
        example.showBug(20); // TRIGGER BUG: VarTypeName
    }
}