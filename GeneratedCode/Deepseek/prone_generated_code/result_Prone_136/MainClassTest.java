import org.junit.Test;
import java.lang.reflect.Field;
import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testShowBug() throws NoSuchFieldException, IllegalAccessException {
        MainClass mc = new MainClass();
        Field privateField = MainClass.class.getDeclaredField("securityContract");
        privateField.setAccessible(true); // TRIGGER BUG: PrivateSecurityContractProtoAccess
        int result = privateField.getInt(mc); // TRIGGER BUG: PrivateSecurityContractProtoAccess
        assertNotEquals(100, result); // The securityContract should not be 100
    }
}