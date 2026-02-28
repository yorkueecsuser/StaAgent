import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class VarTypeNameTest {
    VarTypeName varTypeName = new VarTypeName();
    
    @Test
    public void testShowBug() {
        List<String> inputList = new ArrayList<>();
        inputList.add("Hello");
        inputList.add("World");
        List<String> result = varTypeName.showBug(inputList);
        assertNotNull(result); // TRIGGER BUG: VarTypeName
    }
}